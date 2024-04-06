package assignment4_builder.nutrition_plan;

import assignment4_builder.nutrition_plan.FitnessGoal;
import assignment4_builder.nutrition_plan.NutritionPlan;

import java.util.List;

public interface NutritionPlanBuilder {
    public void setCaloricIntake(Integer intake);

    public void setMacronutrientRatios(Integer chRatio, Integer proteinRatio, Integer fatsRatio);

    public void setMealPlans(List<String> plans);

    public void setFitnessGoal(FitnessGoal goal);

    public void setDietaryRestrictions(List<String> dietaryRestrictions);

    public NutritionPlan build();
}
