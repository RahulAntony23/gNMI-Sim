import com.github.gnmi.proto.GetRequest;
import com.github.gnmi.proto.GetResponse;
import com.github.gnmi.proto.Notification;
import com.github.gnmi.proto.gNMIGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.logging.Logger;

public class GnmiSwitch extends gNMIGrpc.gNMIImplBase {

    private static final Logger logger = Logger.getLogger(GnmiSwitch.class.getName());
    private final String switchName;
    private final boolean isPortOpen;
    private final KafkaMessageProducer kafkaProducer;

    public GnmiSwitch(String switchName, boolean isPortOpen, KafkaMessageProducer kafkaProducer) {
        this.switchName = switchName;
        this.isPortOpen = isPortOpen;
        this.kafkaProducer = kafkaProducer;
    }

    public static void main(String[] args) throws Exception {
        // Create a new server to listen on port 10164
        KafkaMessageProducer kafkaProducer = new KafkaMessageProducer("localhost:9092");
        Server server = ServerBuilder.forPort(10164)
                .addService(new GnmiSwitch("Switch1", true, kafkaProducer))
                .build();

        // Start the server
        logger.info("Starting server...");
        server.start();
        logger.info("Server is running.");

        // Keep the server running until the program is terminated
        server.awaitTermination();
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        // Log the connection
        logger.info("Connection is successful.");
        kafkaProducer.sendMessage("GnmiTopic", "Request received from client.");

        // Create a long timestamp
        long timestamp = System.currentTimeMillis() * 1000000;

        // Create a Notification with the timestamp
        Notification notification = Notification.newBuilder()
                .setTimestamp(timestamp)
                .build();

        // Process the GetRequest and create a GetResponse
        // Include the Notification in the GetResponse
        GetResponse response = GetResponse.newBuilder()
                .addNotification(notification)
                .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}