import Food.Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Diet diet = new Diet();
        diet.setUserTarget();
        diet.setUserDietIntensity();
        diet.setUserActivityLevel();
        diet.setBasalMetabolism(diet.basalMetabolismCalculation());
        diet.setUserActivityIndex();
        diet.setUserCaloricWaste();
        diet.setUserCaloriesConsume();

        System.out.println("Taget" + diet.getTarget() + "\n" +
                "Diet Intensity" + diet.getDietIntensity() + "\n" +
                "Diet Activity Level" + diet.getActivityLevel() + "\n" +
                "Activity Index" + diet.getActivityIndex() + "\n" +
                "Basal Metabolism" + diet.getBasalMetabolism() + "\n" +
                "Caloric Waste" + diet.getCaloricWaste() + "\n" +
                "Calories Consume" + diet.getCaloriesConsume());
    }

    // Breakfast
    Food chickenBreast = new Food(195, 29.55f, 7.72f, 0, 100, 0);
    Food eggs = new Food(155, 12.58f, 10.61f, 1.12f, 0, 1);
    Food oats = new Food(375, 14, 7, 59, 100, 0);
    Food greekYourt = new Food(59, 10, 0, 4, 100, 0);
    Food frozenBlueBerries = new Food(52, 0.7f, 0, 11, 100, 0);
}


/*
    Desayuno: 25-30% de las calorías diarias
    Comida (almuerzo): 30-35% de las calorías diarias
    Merienda: 10-15% de las calorías diarias
    Cena: 25-30% de las calorías diarias
*/
