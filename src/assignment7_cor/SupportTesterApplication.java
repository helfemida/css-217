package assignment7_cor;

public class SupportTesterApplication {
    public static void main(String[] args) {
        SupportHandler networkSupportHandler = new NetworkSupportHandler(PriorityLevel.HIGH);
        SupportHandler softwareSupportHandler = new SoftwareSupportHandler(PriorityLevel.MEDIUM);
        SupportHandler hardwareSupportHandler = new HardwareSupportHandler(PriorityLevel.LOW);

        networkSupportHandler.setNextSupportHandler(softwareSupportHandler);
        softwareSupportHandler.setNextSupportHandler(hardwareSupportHandler);

        SupportRequest request1 = new SupportRequest(1, "hardware troubles", PriorityLevel.HIGH);
        SupportRequest request2 = new SupportRequest(2, "network troubles", PriorityLevel.MEDIUM);
        SupportRequest request3 = new SupportRequest(3, "software troubles", PriorityLevel.LOW);

        hardwareSupportHandler.handle(request1);
        networkSupportHandler.handle(request2);
        softwareSupportHandler.handle(request3);
    }
}
