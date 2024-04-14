public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        TargetChoice choice = target.getTarget();
        System.out.println("Your target is: " + choice);
        System.out.println("------------------------------------");
        BasalMetabolism basalMetabolism = new BasalMetabolism();
        System.out.println("Your basal metabolism is: " + basalMetabolism.getBasalMetabolism());
        System.out.println("------------------------------------");
        BasalMetabolismMultipliedByActivity basalMetabolismMultipliedByActivity = new BasalMetabolismMultipliedByActivity(basalMetabolism);
        System.out.println("Your basal metabolism multiplied by activity index is: " + basalMetabolismMultipliedByActivity.getBasalMetabolismMultipliedByActivity());
        System.out.println("------------------------------------");
        CaloriesTarget caloriesTarget = new CaloriesTarget(target, basalMetabolismMultipliedByActivity);
        System.out.println("Your daily calories target is: " + caloriesTarget.getCaloriesTarget());
        System.out.println("------------------------------------");
        Macros macros = new Macros(basalMetabolism, target, caloriesTarget);
        System.out.println("Your daily protein intake is: " + macros.getProteinGrams());
        System.out.println("Your daily fats intake is: " + macros.getFatsGrams());
        System.out.println("Your daily carbs intake is: " + macros.getCarbsGrams());
        System.out.println("------------------------------------");
        System.out.println("Your daily protein calories is: " + macros.getProteinCalories());
        System.out.println("Your daily fats calories is: " + macros.getFatsCalories());
        System.out.println("Your daily carbs calories is: " + macros.getCarbsCalories());
        System.out.println("------------------------------------");
        System.out.println("Calories target: " + caloriesTarget.getCaloriesTarget());
        System.out.println("Macors calories: " + (macros.getProteinCalories() + macros.getFatsCalories() + macros.getCarbsCalories()));
    }
}
