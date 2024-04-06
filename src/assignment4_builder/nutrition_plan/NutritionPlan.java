package assignment4_builder.nutrition_plan;

import assignment4_builder.nutrition_plan.FitnessGoal;

import java.util.List;

public class NutritionPlan {
    private Integer dailyCaloricIntake;
    private Integer chRatio;
    private Integer proteinRatio;
    private Integer fatsRatio;
    private FitnessGoal goal;
    private List<String> mealPlans;
    private List<String> restrictions;

    public NutritionPlan(FitnessGoal goal, Integer dailyCaloricIntake, Integer chRatio, Integer proteinRatio, Integer fatsRatio,
                         List<String> mealPlans, List<String> restrictions) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.chRatio = chRatio;
        this.proteinRatio = proteinRatio;
        this.fatsRatio = fatsRatio;
        this.goal = goal;
        this.mealPlans = mealPlans;
        this.restrictions = restrictions;
    }

    public Integer getDailyCaloricIntake() {
        return dailyCaloricIntake;
    }

    public void setDailyCaloricIntake(Integer dailyCaloricIntake) {
        this.dailyCaloricIntake = dailyCaloricIntake;
    }

    public Integer getChRatio() {
        return chRatio;
    }

    public void setChRatio(Integer chRatio) {
        this.chRatio = chRatio;
    }

    public Integer getProteinRatio() {
        return proteinRatio;
    }

    public void setProteinRatio(Integer proteinRatio) {
        this.proteinRatio = proteinRatio;
    }

    public Integer getFatsRatio() {
        return fatsRatio;
    }

    public void setFatsRatio(Integer fatsRatio) {
        this.fatsRatio = fatsRatio;
    }

    public FitnessGoal getGoal() {
        return goal;
    }

    public void setGoal(FitnessGoal goal) {
        this.goal = goal;
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    public List<String> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }

    @Override
    public String toString() {
        String mealPlan = "";
        for(String meal: mealPlans){
            mealPlan += meal + "\n";
        }

        String restrictions = "";
        for(String restriction: this.restrictions){
            restrictions += restriction + ", ";
        }

        return "Goal: " + goal +
                "\n Daily Caloric Intake: " + dailyCaloricIntake +
                "\n Carbohydrates ratio: " + chRatio +
                "\n Protein Ratio: " + proteinRatio +
                "\n Fats Ratio: " + fatsRatio +
                "\n Sample Meal Plans: \n" + mealPlan.trim() +
                "\n Restrictions: " + restrictions.trim();
    }
}
