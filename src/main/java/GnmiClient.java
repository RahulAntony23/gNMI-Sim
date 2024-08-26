import gnmi.Gnmi;
import gnmi.Gnmi.Path;
import gnmi.Gnmi.PathElem;
import gnmi.Gnmi.SetRequest;
import gnmi.Gnmi.TypedValue;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class GnmiClient {
    private final ManagedChannel channel;
    private final Gnmi.GnmiStub asyncStub;

    public GnmiClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build());
    }

    GnmiClient(ManagedChannel channel) {
        this.channel = channel;
        asyncStub = Gnmi.gNMIStub.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void setTimeZone(String timeZone) {
        Path path = Path.newBuilder()
                .addElem(PathElem.newBuilder().setName("system"))
                .addElem(PathElem.newBuilder().setName("clock"))
                .addElem(PathElem.newBuilder().setName("config"))
                .addElem(PathElem.newBuilder().setName("timezone-name"))
                .build();

        TypedValue value = TypedValue.newBuilder()
                .setStringVal(timeZone)
                .build();

        Gnmi.Update update = Gnmi.Update.newBuilder()
                .setPath(path)
                .setVal(value)
                .build();

        SetRequest request = SetRequest.newBuilder()
                .addUpdate(update)
                .build();

        try {
            asyncStub.set(request);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public static void main(String[] args) throws Exception {
        GnmiClient client = new GnmiClient("localhost", 10161);
        try {
            client.setTimeZone("Europe/Paris");
        } finally {
            client.shutdown();
        }
    }
}