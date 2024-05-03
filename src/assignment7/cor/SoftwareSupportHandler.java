package assignment7.cor;

public class SoftwareSupportHandler extends SupportHandler {
    public SoftwareSupportHandler(PriorityLevel priorityLevel){
        super(priorityLevel);
    }

    @Override
    public void handle(SupportRequest request) {
        System.out.println("Software team is handling " + request.getDescription() +
                " with priority " + request.getPriority());
    }
}
