package assignment4_builder.nutrition_plan;

import java.util.Arrays;
import java.util.List;

public class MaintenanceNutritionPlanBuilder implements NutritionPlanBuilder {
    private NutritionPlan plan;
    public MaintenanceNutritionPlanBuilder(){
        List<String> meals = Arrays.asList(
                "Breakfast: Scrambled eggs with whole wheat toast and avocado",
                "Snack: Apple slices with almond butter",
                "Lunch: Quinoa salad with chickpeas, feta cheese, and mixed vegetables",
                "Snack: Cottage cheese with pineapple chunks",
                "Dinner: Grilled tofu with stir-fried vegetables and brown rice");
        List<String> restrictions = List.of("none");
        plan = new NutritionPlan(FitnessGoal.WEIGHT_LOSS,
                2000, 40, 30, 30, meals, restrictions);
    }
    @Override
    public void setCaloricIntake(Integer intake) {
        plan.setDailyCaloricIntake(intake);
    }

    @Override
    public void setMacronutrientRatios(Integer chRatio, Integer proteinRatio, Integer fatsRatio) {
        plan.setChRatio(chRatio);
        plan.setChRatio(proteinRatio);
        plan.setChRatio(fatsRatio);
    }

    @Override
    public void setMealPlans(List<String> plans) {
        plan.setMealPlans(plans);
    }

    @Override
    public void setFitnessGoal(FitnessGoal goal) {
        plan.setGoal(goal);
    }

    @Override
    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        plan.setRestrictions(dietaryRestrictions);
    }

    @Override
    public NutritionPlan build() {
        return this.plan;
    }

}
