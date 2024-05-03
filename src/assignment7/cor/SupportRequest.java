package assignment7.cor;

public class SupportRequest {
    private int requestId;
    private String description;
    private PriorityLevel priority;

    public SupportRequest(int requestId, String description, PriorityLevel priority) {
        this.requestId = requestId;
        this.description = description;
        this.priority = priority;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getDescription() {
        return description;
    }

    public PriorityLevel getPriority() {
        return priority;
    }
}
