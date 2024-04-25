package assignment7_cor;

public class NetworkSupportHandler extends SupportHandler {
    public NetworkSupportHandler(PriorityLevel priorityLevel){
        super(priorityLevel);
    }

    @Override
    public void handle(SupportRequest request) {
        System.out.println("Network team is handling " + request.getDescription() +
                " with priority " + request.getPriority());
    }
}