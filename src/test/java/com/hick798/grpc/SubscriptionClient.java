package com.hick798.grpc;

import geyser.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;


public class SubscriptionClient {
    private final ManagedChannel channel;
    private final GeyserGrpc.GeyserStub stub;

    public SubscriptionClient(String target) {
        this(ManagedChannelBuilder.forTarget(target).build());
    }

    SubscriptionClient(ManagedChannel channel) {
        this.channel = channel;
        this.stub = GeyserGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS);
    }

    public void subscribe(SubscribeRequest request) {
        StreamObserver<SubscribeUpdate> responseObserver = new StreamObserver<SubscribeUpdate>() {
            @Override
            public void onNext(SubscribeUpdate tx) {
                System.out.println(LocalDateTime.now()+"->"+tx.getTransaction().getSlot());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Subscription error: " + t.getMessage());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                subscribe(request);
            }

            @Override
            public void onCompleted() {
                System.out.println("Subscription completed");
            }
        };
        StreamObserver<SubscribeRequest> subscribe = stub.subscribe(responseObserver);
        subscribe.onNext(request);
    }


    public static void main(String[] args) throws Exception {
        SubscriptionClient client = new SubscriptionClient("solana-yellowstone-grpc.publicnode.com:443");
        try {
            SubscribeRequest.Builder builder = SubscribeRequest.newBuilder();
            builder.setCommitment(CommitmentLevel.CONFIRMED);
            builder.putTransactions("transactions_sub", SubscribeRequestFilterTransactions.newBuilder().addAccountInclude("6EF8rrecthR5Dkzon8Nwu78hRvfCKubJ14M5uBEwF6P").build());

            client.subscribe(builder.build());
            Thread.sleep(30000); // Wait for some messages
        } finally {
            client.shutdown();
        }
    }
}