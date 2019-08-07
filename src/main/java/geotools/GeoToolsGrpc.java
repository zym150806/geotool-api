package geotools;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0-SNAPSHOT)",
    comments = "Source: geotools.proto")
public final class GeoToolsGrpc {

  private GeoToolsGrpc() {}

  public static final String SERVICE_NAME = "geoservice.GeoTools";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.geotools.InPolygonRequest,
      io.grpc.geotools.InPolygonReply> getInPolygonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InPolygon",
      requestType = io.grpc.geotools.InPolygonRequest.class,
      responseType = io.grpc.geotools.InPolygonReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.geotools.InPolygonRequest,
      io.grpc.geotools.InPolygonReply> getInPolygonMethod() {
    io.grpc.MethodDescriptor<io.grpc.geotools.InPolygonRequest, io.grpc.geotools.InPolygonReply> getInPolygonMethod;
    if ((getInPolygonMethod = GeoToolsGrpc.getInPolygonMethod) == null) {
      synchronized (GeoToolsGrpc.class) {
        if ((getInPolygonMethod = GeoToolsGrpc.getInPolygonMethod) == null) {
          GeoToolsGrpc.getInPolygonMethod = getInPolygonMethod =
              io.grpc.MethodDescriptor.<io.grpc.geotools.InPolygonRequest, io.grpc.geotools.InPolygonReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InPolygon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.geotools.InPolygonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.geotools.InPolygonReply.getDefaultInstance()))
              .setSchemaDescriptor(new GeoToolsMethodDescriptorSupplier("InPolygon"))
              .build();
        }
      }
    }
    return getInPolygonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeoToolsStub newStub(io.grpc.Channel channel) {
    return new GeoToolsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeoToolsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GeoToolsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeoToolsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GeoToolsFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GeoToolsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void inPolygon(io.grpc.geotools.InPolygonRequest request,
        io.grpc.stub.StreamObserver<io.grpc.geotools.InPolygonReply> responseObserver) {
      asyncUnimplementedUnaryCall(getInPolygonMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInPolygonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.geotools.InPolygonRequest,
                io.grpc.geotools.InPolygonReply>(
                  this, METHODID_IN_POLYGON)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GeoToolsStub extends io.grpc.stub.AbstractStub<GeoToolsStub> {
    private GeoToolsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeoToolsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GeoToolsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeoToolsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void inPolygon(io.grpc.geotools.InPolygonRequest request,
        io.grpc.stub.StreamObserver<io.grpc.geotools.InPolygonReply> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInPolygonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GeoToolsBlockingStub extends io.grpc.stub.AbstractStub<GeoToolsBlockingStub> {
    private GeoToolsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeoToolsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GeoToolsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeoToolsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.geotools.InPolygonReply inPolygon(io.grpc.geotools.InPolygonRequest request) {
      return blockingUnaryCall(
          getChannel(), getInPolygonMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GeoToolsFutureStub extends io.grpc.stub.AbstractStub<GeoToolsFutureStub> {
    private GeoToolsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GeoToolsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GeoToolsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GeoToolsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.geotools.InPolygonReply> inPolygon(
        io.grpc.geotools.InPolygonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInPolygonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IN_POLYGON = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GeoToolsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GeoToolsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IN_POLYGON:
          serviceImpl.inPolygon((io.grpc.geotools.InPolygonRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.geotools.InPolygonReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GeoToolsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GeoToolsBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.geotools.GeoToolsProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GeoTools");
    }
  }

  private static final class GeoToolsFileDescriptorSupplier
      extends GeoToolsBaseDescriptorSupplier {
    GeoToolsFileDescriptorSupplier() {}
  }

  private static final class GeoToolsMethodDescriptorSupplier
      extends GeoToolsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GeoToolsMethodDescriptorSupplier(String methodName) {
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
      synchronized (GeoToolsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GeoToolsFileDescriptorSupplier())
              .addMethod(getInPolygonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
