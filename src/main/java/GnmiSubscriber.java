import com.github.gnmi.proto.GetRequest;
import com.github.gnmi.proto.GetResponse;
import com.github.gnmi.proto.Notification;
import com.github.gnmi.proto.gNMIGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.ClientCalls;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class GnmiSubscriber {

    private final Channel channel;
    private static final Logger logger = Logger.getLogger(GnmiSubscriber.class.getName());

    public GnmiSubscriber(Channel channel) {
        this.channel = channel;
    }


    public GetResponse
    get(GetRequest request) {
        logger.info("Sending GetRequest...");
        gNMIGrpc.gNMIStub stub = gNMIGrpc.newStub(channel);

        // Create a CountDownLatch to wait for the GetResponse
        final CountDownLatch finishLatch = new CountDownLatch(1);

        // Create a StreamObserver to handle the GetResponse
        StreamObserver<GetResponse> responseObserver = new StreamObserver<GetResponse>() {
            @Override
            public void onNext(GetResponse response) {
                // Print the switch name and port status
                for (Notification notification : response.getNotificationList()) {
                    System.out.println(notification.getTimestamp());
                }
            }

            @Override
            public void onError(Throwable t) {
                // Handle error
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("Received GetResponse.");
                finishLatch.countDown();
            }
        };

        // Pass the StreamObserver to the get method
        stub.get(request, responseObserver);

        // Wait for the GetResponse
        try {
            if (!finishLatch.await(1, TimeUnit.MINUTES)) {
                logger.warning("get can not finish within 1 minute");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return null; // The GetResponse is handled by the StreamObserver, so return null
    }
    public static void main(String[] args) {
        logger.info("Creating ManagedChannel...");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 10164)
                .usePlaintext()
                .build();

        GnmiSubscriber subscriber = new GnmiSubscriber(channel);

        // Create a GetRequest
        GetRequest request = GetRequest.newBuilder().build(); // Update this line to create the appropriate GetRequest

        // Use the "get" function to get details about the switch
        logger.info("Getting details about the switch...");
        GetResponse response = subscriber.get(request);

        // Print the response
        System.out.println(response);
    }
}