package assignment7_cor;

public abstract class SupportHandler {
   private PriorityLevel priorityLevel;
   private SupportHandler nextSupportHandler;
   public SupportHandler(PriorityLevel priorityLevel){
      this.priorityLevel = priorityLevel;
   }

   public void setNextSupportHandler(SupportHandler nextSupportHandler) {
      this.nextSupportHandler = nextSupportHandler;
   }
   public void requestHandlerManager(SupportRequest request, PriorityLevel priorityLevel){
      if(priorityLevel.ordinal() >= this.priorityLevel.ordinal()){
         handle(request);
      }
      if(nextSupportHandler != null){
         nextSupportHandler.requestHandlerManager(request, priorityLevel);
      }
   }
   public abstract void handle(SupportRequest request);
}
