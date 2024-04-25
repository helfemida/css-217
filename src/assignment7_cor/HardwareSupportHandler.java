package assignment7_cor;

public class HardwareSupportHandler extends SupportHandler {
    public HardwareSupportHandler(PriorityLevel priorityLevel){
        super(priorityLevel);
    }

    @Override
    public void handle(SupportRequest request) {
        System.out.println("Hardware team is handling " + request.getDescription() +
                " with priority " + request.getPriority());
    }
}
