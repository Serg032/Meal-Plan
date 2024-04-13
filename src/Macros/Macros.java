package Macros;

import BasalMetabolism.BasalMetabolism;
import CaloriesTarget.CaloriesTarget;
import Target.Target;

import java.util.Scanner;

public class Macros {
    private BasalMetabolism basalMetabolism;
    Target target;
    CaloriesTarget  caloriesTarget;
    private float protein;
    private float carbs;
    private float fats;

    public Macros(BasalMetabolism basalMetabolism,Target target, CaloriesTarget caloriesTarget) {
        this.basalMetabolism = basalMetabolism;
        this.target = target;
        this.caloriesTarget = caloriesTarget;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getCarbs() {
        return carbs;
    }

    public void setCarbs(float carbs) {
        this.carbs = carbs;
    }

    public float getFats() {
        return fats;
    }

    public void setFats(float fats) {
        this.fats = fats;
    }

    private void calculateMacrosByCaloriesTarget(CaloriesTarget caloriesTarget) {
        float protein = caloriesTarget.getCaloriesTarget() * 0.3f / 4;
        float carbs = caloriesTarget.getCaloriesTarget() * 0.5f / 4;
        float fats = caloriesTarget.getCaloriesTarget() * 0.2f / 9;
        this.setProtein(protein);
        this.setCarbs(carbs);
        this.setFats(fats);
    }
// Todo: Implement the method calculateMacrosByGainWeightTarget
    private void calculateMacrosByGainWeightTarget(CaloriesTarget caloriesTarget) {
        /*
        * - Proteina 1,6 - 2,2 x kg x dia
        - Grasa 0,8 - 1,5 x kg x dia
        - Carbohidratos el resto

        Ej:
        - 87 x 1,8 = 157g x 4 (kcal x g de prote) = 628 cal
        - 87 x 0,8 = 70g x 9 (kcal x g de grasa) = 630 cal
            - 628 + 630 = 1258 cal
        - 2762 (Objetivo) - 1258 = 1804 / 4 = 376*/
        Scanner scanner = new Scanner(System.in);
        this.askUserHowManyGramsOfProtein(target, scanner);
        this.askUserHowManyGramsOfFat(target, scanner);
        this.calculateCarbs(caloriesTarget);
    }

    private void askUserHowManyGramsOfProtein(Target target, Scanner scanner){
        float grams = 0;
        switch (target.getTarget()){
            case GAIN_WEIGHT:
                System.out.println("How many grams of protein do you want to eat per Kg?");
                System.out.println("It must be between 1.6 and 2.2 grams per kg of body weight.");
                while (grams < 1.6 || grams > 2.2){
                    System.out.println("Invalid choice. Please enter a number between 1.6 and 2.2:");
                    grams = scanner.nextFloat();
                }
                this.setProtein(grams * this.basalMetabolism.getWeight() * 4);
                break;
            case LOSE_WEIGHT:
                System.out.println("How many grams of protein do you want to eat per Kg?");
                System.out.println("It must be between 2,5 and 3 grams per kg of body weight.");
                while (grams < 2.5 || grams > 3){
                    System.out.println("Invalid choice. Please enter a number between 2.5 and 3:");
                    grams = scanner.nextFloat();
                }
                this.setProtein(grams * this.basalMetabolism.getWeight() * 4);
                break;
        }
    }

    private void askUserHowManyGramsOfFat(Target target, Scanner scanner){
        float grams = 0;
        switch (target.getTarget()){
            case GAIN_WEIGHT:
                System.out.println("How many grams of carbs do you want to eat per Kg?");
                System.out.println("It must be between 0,8 and 1.5 grams per kg of body weight.");
                while (grams < 0.8 || grams > 1.5){
                    System.out.println("Invalid choice. Please enter a number between 0.8 and 1.5:");
                    grams = scanner.nextFloat();
                }
                this.setFats(grams * this.basalMetabolism.getWeight() * 9);
                break;
            case LOSE_WEIGHT:
                System.out.println("How many grams of carbs do you want to eat per Kg?");
                System.out.println("It must be between 0.6 and 1 grams per kg of body weight.");
                while (grams < 0.6 || grams > 1){
                    System.out.println("Invalid choice. Please enter a number between 0.6 and 1:");
                    grams = scanner.nextFloat();
                }
                grams = scanner.nextFloat();
                this.setFats(grams * this.basalMetabolism.getWeight() * 9);
                break;
        }
    }

    private void calculateCarbs(CaloriesTarget caloriesTarget){
        this.setCarbs(caloriesTarget.getCaloriesTarget() - (this.getProtein() + this.getFats()) / 4);
    }
}
