package assignment4.builder.nutrition_plan;

import java.util.Arrays;
import java.util.List;

public class WeightLossNutritionPlanBuilder implements NutritionPlanBuilder {
    private NutritionPlan plan;
    public WeightLossNutritionPlanBuilder(){
        List<String> meals = Arrays.asList(
                "Breakfast: Oatmeal with berries and almonds",
                "Snack: Greek yogurt with sliced cucumbers",
                "Lunch: Grilled chicken salad with mixed greens and vinaigrette dressing\n",
                "Snack: Carrot sticks with hummus",
                "Dinner: Baked salmon with quinoa and steamed vegetables");
        List<String> restrictions = List.of("none");
        plan = new NutritionPlan(FitnessGoal.WEIGHT_LOSS,
                1500, 30, 40, 30, meals, restrictions);
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
