package assignment4_builder.nutrition_plan;

import java.util.Scanner;

public class Application {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your goal? ");
        String stringOfGoal = in.nextLine();

        FitnessGoal goal = getGoal(stringOfGoal);

        NutritionPlanDirector director = new NutritionPlanDirector();
        NutritionPlan nutritionPlan = director.createNutritionPlan(goal);

        System.out.println("Here is your nutrition plan: \n" +
                "" + nutritionPlan);
    }
    private static FitnessGoal getGoal(String stringOfGoal){
        if(stringOfGoal.contains("loss")) return FitnessGoal.WEIGHT_LOSS;
        if(stringOfGoal.contains("gain")) return FitnessGoal.WEIGHT_GAIN;
        if(stringOfGoal.contains("maintenance")) return FitnessGoal.MAINTENANCE;
        return null;
    }
}
