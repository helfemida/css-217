package assignment4.builder.nutrition_plan;

import java.util.Arrays;
import java.util.List;

public class WeightGainNutritionPlanBuilder implements NutritionPlanBuilder {
    private NutritionPlan plan;
    public WeightGainNutritionPlanBuilder(){
        List<String> meals = Arrays.asList(
                "Breakfast: Whole grain toast with peanut butter and banana slices",
                "Snack: Trail mix with dried fruits and nuts",
                "Lunch: Turkey and avocado wrap with whole grain tortilla",
                "Snack: Greek yogurt with granola",
                "Dinner: Beef stir-fry with brown rice and broccoli");
        List<String> restrictions = List.of("none");
        plan = new NutritionPlan(FitnessGoal.WEIGHT_GAIN,
                2500, 50, 30, 20, meals, restrictions);
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
