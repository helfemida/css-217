package assignment4.builder.nutrition_plan;

public class NutritionPlanDirector {
    private NutritionPlanBuilder nutritionPlanBuilder;

    public void setNutritionPlanBuilder(NutritionPlanBuilder nutritionPlanBuilder) {
        this.nutritionPlanBuilder = nutritionPlanBuilder;
    }

    public NutritionPlan createNutritionPlan(FitnessGoal goal) {
        switch (goal) {
            case WEIGHT_LOSS -> {
                return new WeightLossNutritionPlanBuilder().build();
            }
            case WEIGHT_GAIN -> {
                return new WeightGainNutritionPlanBuilder().build();
            }
            case MAINTENANCE -> {
                return new MaintenanceNutritionPlanBuilder().build();
            }
        }
        return null;
    }


}
