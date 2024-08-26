import gnmi.Gnmi;
import gnmi.gNMIGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;


public class PortDetailsClient {
    private final ManagedChannel channel;
    private final gNMIGrpc.gNMIBlockingStub blockingStub;

    private static final Logger logger = LoggerFactory.getLogger(PortDetailsClient.class);

    public PortDetailsClient(String host, int port) {
        logger.info("Creating client for host {} and port {}", host, port);
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.blockingStub = gNMIGrpc.newBlockingStub(channel);
    }

    public PortDetailsClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = gNMIGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        logger.info("Shutting down client");
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getPortDetails() {
        logger.info("Getting port details");
        Gnmi.GetRequest request = Gnmi.GetRequest.newBuilder()
            .addPath(Gnmi.Path.newBuilder().addElement("interfaces").addElement("interface").addElement("eth1").build())
            .build();
        Gnmi.GetResponse response = blockingStub.get(request);
        logger.info("Received port details: {}", response);
    }

    public static void main(String[] args) throws Exception {
        logger.info("Starting application");
        PortDetailsClient client = new PortDetailsClient("192.168.91.172", 10164);
        try {
            client.getPortDetails();
        } finally {
            client.shutdown();
        }
        logger.info("Application finished");
    }
}