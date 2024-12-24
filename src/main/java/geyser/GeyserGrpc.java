package geyser;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
//@javax.annotation.Generated(
//    value = "by gRPC proto compiler (version 1.69.0)",
//    comments = "Source: geyser.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeyserGrpc {

  private GeyserGrpc() {}

  public static final String SERVICE_NAME = "geyser.Geyser";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SubscribeRequest,
      SubscribeUpdate> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = SubscribeRequest.class,
      responseType = SubscribeUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<SubscribeRequest,
      SubscribeUpdate> getSubscribeMethod() {
    io.grpc.MethodDescriptor<SubscribeRequest, SubscribeUpdate> getSubscribeMethod;
    if ((getSubscribeMethod = GeyserGrpc.getSubscribeMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getSubscribeMethod = GeyserGrpc.getSubscribeMethod) == null) {
          GeyserGrpc.getSubscribeMethod = getSubscribeMethod =
              io.grpc.MethodDescriptor.<SubscribeRequest, SubscribeUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SubscribeUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("Subscribe"))
              .build();
        }
      }
    }
    return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<PingRequest,
      PongResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = PingRequest.class,
      responseType = PongResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<PingRequest,
      PongResponse> getPingMethod() {
    io.grpc.MethodDescriptor<PingRequest, PongResponse> getPingMethod;
    if ((getPingMethod = GeyserGrpc.getPingMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getPingMethod = GeyserGrpc.getPingMethod) == null) {
          GeyserGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<PingRequest, PongResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  PongResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetLatestBlockhashRequest,
      GetLatestBlockhashResponse> getGetLatestBlockhashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestBlockhash",
      requestType = GetLatestBlockhashRequest.class,
      responseType = GetLatestBlockhashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetLatestBlockhashRequest,
      GetLatestBlockhashResponse> getGetLatestBlockhashMethod() {
    io.grpc.MethodDescriptor<GetLatestBlockhashRequest, GetLatestBlockhashResponse> getGetLatestBlockhashMethod;
    if ((getGetLatestBlockhashMethod = GeyserGrpc.getGetLatestBlockhashMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetLatestBlockhashMethod = GeyserGrpc.getGetLatestBlockhashMethod) == null) {
          GeyserGrpc.getGetLatestBlockhashMethod = getGetLatestBlockhashMethod =
              io.grpc.MethodDescriptor.<GetLatestBlockhashRequest, GetLatestBlockhashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestBlockhash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetLatestBlockhashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetLatestBlockhashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetLatestBlockhash"))
              .build();
        }
      }
    }
    return getGetLatestBlockhashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetBlockHeightRequest,
      GetBlockHeightResponse> getGetBlockHeightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlockHeight",
      requestType = GetBlockHeightRequest.class,
      responseType = GetBlockHeightResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetBlockHeightRequest,
      GetBlockHeightResponse> getGetBlockHeightMethod() {
    io.grpc.MethodDescriptor<GetBlockHeightRequest, GetBlockHeightResponse> getGetBlockHeightMethod;
    if ((getGetBlockHeightMethod = GeyserGrpc.getGetBlockHeightMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetBlockHeightMethod = GeyserGrpc.getGetBlockHeightMethod) == null) {
          GeyserGrpc.getGetBlockHeightMethod = getGetBlockHeightMethod =
              io.grpc.MethodDescriptor.<GetBlockHeightRequest, GetBlockHeightResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlockHeight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetBlockHeightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetBlockHeightResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetBlockHeight"))
              .build();
        }
      }
    }
    return getGetBlockHeightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetSlotRequest,
      GetSlotResponse> getGetSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSlot",
      requestType = GetSlotRequest.class,
      responseType = GetSlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetSlotRequest,
      GetSlotResponse> getGetSlotMethod() {
    io.grpc.MethodDescriptor<GetSlotRequest, GetSlotResponse> getGetSlotMethod;
    if ((getGetSlotMethod = GeyserGrpc.getGetSlotMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetSlotMethod = GeyserGrpc.getGetSlotMethod) == null) {
          GeyserGrpc.getGetSlotMethod = getGetSlotMethod =
              io.grpc.MethodDescriptor.<GetSlotRequest, GetSlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetSlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetSlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetSlot"))
              .build();
        }
      }
    }
    return getGetSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<IsBlockhashValidRequest,
      IsBlockhashValidResponse> getIsBlockhashValidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsBlockhashValid",
      requestType = IsBlockhashValidRequest.class,
      responseType = IsBlockhashValidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<IsBlockhashValidRequest,
      IsBlockhashValidResponse> getIsBlockhashValidMethod() {
    io.grpc.MethodDescriptor<IsBlockhashValidRequest, IsBlockhashValidResponse> getIsBlockhashValidMethod;
    if ((getIsBlockhashValidMethod = GeyserGrpc.getIsBlockhashValidMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getIsBlockhashValidMethod = GeyserGrpc.getIsBlockhashValidMethod) == null) {
          GeyserGrpc.getIsBlockhashValidMethod = getIsBlockhashValidMethod =
              io.grpc.MethodDescriptor.<IsBlockhashValidRequest, IsBlockhashValidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsBlockhashValid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  IsBlockhashValidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  IsBlockhashValidResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("IsBlockhashValid"))
              .build();
        }
      }
    }
    return getIsBlockhashValidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GetVersionRequest,
      GetVersionResponse> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = GetVersionRequest.class,
      responseType = GetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GetVersionRequest,
      GetVersionResponse> getGetVersionMethod() {
    io.grpc.MethodDescriptor<GetVersionRequest, GetVersionResponse> getGetVersionMethod;
    if ((getGetVersionMethod = GeyserGrpc.getGetVersionMethod) == null) {
      synchronized (GeyserGrpc.class) {
        if ((getGetVersionMethod = GeyserGrpc.getGetVersionMethod) == null) {
          GeyserGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<GetVersionRequest, GetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GetVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GeyserMethodDescriptorSupplier("GetVersion"))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeyserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserStub>() {
        @Override
        public GeyserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserStub(channel, callOptions);
        }
      };
    return GeyserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeyserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserBlockingStub>() {
        @Override
        public GeyserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserBlockingStub(channel, callOptions);
        }
      };
    return GeyserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeyserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeyserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeyserFutureStub>() {
        @Override
        public GeyserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeyserFutureStub(channel, callOptions);
        }
      };
    return GeyserFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<SubscribeUpdate> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    default void ping(PingRequest request,
                      io.grpc.stub.StreamObserver<PongResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    default void getLatestBlockhash(GetLatestBlockhashRequest request,
                                    io.grpc.stub.StreamObserver<GetLatestBlockhashResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLatestBlockhashMethod(), responseObserver);
    }

    /**
     */
    default void getBlockHeight(GetBlockHeightRequest request,
                                io.grpc.stub.StreamObserver<GetBlockHeightResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBlockHeightMethod(), responseObserver);
    }

    /**
     */
    default void getSlot(GetSlotRequest request,
                         io.grpc.stub.StreamObserver<GetSlotResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSlotMethod(), responseObserver);
    }

    /**
     */
    default void isBlockhashValid(IsBlockhashValidRequest request,
                                  io.grpc.stub.StreamObserver<IsBlockhashValidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsBlockhashValidMethod(), responseObserver);
    }

    /**
     */
    default void getVersion(GetVersionRequest request,
                            io.grpc.stub.StreamObserver<GetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Geyser.
   */
  public static abstract class GeyserImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeyserGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Geyser.
   */
  public static final class GeyserStub
      extends io.grpc.stub.AbstractAsyncStub<GeyserStub> {
    private GeyserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GeyserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<SubscribeRequest> subscribe(
        io.grpc.stub.StreamObserver<SubscribeUpdate> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void ping(PingRequest request,
                     io.grpc.stub.StreamObserver<PongResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLatestBlockhash(GetLatestBlockhashRequest request,
                                   io.grpc.stub.StreamObserver<GetLatestBlockhashResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestBlockhashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockHeight(GetBlockHeightRequest request,
                               io.grpc.stub.StreamObserver<GetBlockHeightResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBlockHeightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSlot(GetSlotRequest request,
                        io.grpc.stub.StreamObserver<GetSlotResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isBlockhashValid(IsBlockhashValidRequest request,
                                 io.grpc.stub.StreamObserver<IsBlockhashValidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsBlockhashValidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVersion(GetVersionRequest request,
                           io.grpc.stub.StreamObserver<GetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Geyser.
   */
  public static final class GeyserBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeyserBlockingStub> {
    private GeyserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GeyserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserBlockingStub(channel, callOptions);
    }

    /**
     */
    public PongResponse ping(PingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetLatestBlockhashResponse getLatestBlockhash(GetLatestBlockhashRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestBlockhashMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetBlockHeightResponse getBlockHeight(GetBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBlockHeightMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetSlotResponse getSlot(GetSlotRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public IsBlockhashValidResponse isBlockhashValid(IsBlockhashValidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsBlockhashValidMethod(), getCallOptions(), request);
    }

    /**
     */
    public GetVersionResponse getVersion(GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Geyser.
   */
  public static final class GeyserFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeyserFutureStub> {
    private GeyserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GeyserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeyserFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<PongResponse> ping(
        PingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetLatestBlockhashResponse> getLatestBlockhash(
        GetLatestBlockhashRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestBlockhashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetBlockHeightResponse> getBlockHeight(
        GetBlockHeightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBlockHeightMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetSlotResponse> getSlot(
        GetSlotRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<IsBlockhashValidResponse> isBlockhashValid(
        IsBlockhashValidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsBlockhashValidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GetVersionResponse> getVersion(
        GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_GET_LATEST_BLOCKHASH = 1;
  private static final int METHODID_GET_BLOCK_HEIGHT = 2;
  private static final int METHODID_GET_SLOT = 3;
  private static final int METHODID_IS_BLOCKHASH_VALID = 4;
  private static final int METHODID_GET_VERSION = 5;
  private static final int METHODID_SUBSCRIBE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((PingRequest) request,
              (io.grpc.stub.StreamObserver<PongResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_BLOCKHASH:
          serviceImpl.getLatestBlockhash((GetLatestBlockhashRequest) request,
              (io.grpc.stub.StreamObserver<GetLatestBlockhashResponse>) responseObserver);
          break;
        case METHODID_GET_BLOCK_HEIGHT:
          serviceImpl.getBlockHeight((GetBlockHeightRequest) request,
              (io.grpc.stub.StreamObserver<GetBlockHeightResponse>) responseObserver);
          break;
        case METHODID_GET_SLOT:
          serviceImpl.getSlot((GetSlotRequest) request,
              (io.grpc.stub.StreamObserver<GetSlotResponse>) responseObserver);
          break;
        case METHODID_IS_BLOCKHASH_VALID:
          serviceImpl.isBlockhashValid((IsBlockhashValidRequest) request,
              (io.grpc.stub.StreamObserver<IsBlockhashValidResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<GetVersionResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribe(
              (io.grpc.stub.StreamObserver<SubscribeUpdate>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubscribeMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              SubscribeRequest,
              SubscribeUpdate>(
                service, METHODID_SUBSCRIBE)))
        .addMethod(
          getPingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              PingRequest,
              PongResponse>(
                service, METHODID_PING)))
        .addMethod(
          getGetLatestBlockhashMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GetLatestBlockhashRequest,
              GetLatestBlockhashResponse>(
                service, METHODID_GET_LATEST_BLOCKHASH)))
        .addMethod(
          getGetBlockHeightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GetBlockHeightRequest,
              GetBlockHeightResponse>(
                service, METHODID_GET_BLOCK_HEIGHT)))
        .addMethod(
          getGetSlotMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GetSlotRequest,
              GetSlotResponse>(
                service, METHODID_GET_SLOT)))
        .addMethod(
          getIsBlockhashValidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              IsBlockhashValidRequest,
              IsBlockhashValidResponse>(
                service, METHODID_IS_BLOCKHASH_VALID)))
        .addMethod(
          getGetVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GetVersionRequest,
              GetVersionResponse>(
                service, METHODID_GET_VERSION)))
        .build();
  }

  private static abstract class GeyserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeyserBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GeyserOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Geyser");
    }
  }

  private static final class GeyserFileDescriptorSupplier
      extends GeyserBaseDescriptorSupplier {
    GeyserFileDescriptorSupplier() {}
  }

  private static final class GeyserMethodDescriptorSupplier
      extends GeyserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GeyserMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GeyserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeyserFileDescriptorSupplier())
              .addMethod(getSubscribeMethod())
              .addMethod(getPingMethod())
              .addMethod(getGetLatestBlockhashMethod())
              .addMethod(getGetBlockHeightMethod())
              .addMethod(getGetSlotMethod())
              .addMethod(getIsBlockhashValidMethod())
              .addMethod(getGetVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
