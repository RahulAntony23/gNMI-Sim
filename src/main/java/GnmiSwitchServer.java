import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GnmiSwitchServer {

    public static void main(String[] args) throws Exception {
        // Create a new server to listen on port 10164
        KafkaMessageProducer kafkaProducer = new KafkaMessageProducer("localhost:9092");
        Server server = ServerBuilder.forPort(10164)
                .addService(new GnmiSwitch(
                        "Rahul Switch",
                        true,
                        kafkaProducer
                ))
                .build();

        // Start the server
        server.start();

        // Keep the server running until the program is terminated
        server.awaitTermination();
    }
}