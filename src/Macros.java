import java.util.Scanner;

public class Macros {
    private BasalMetabolism basalMetabolism;
    Target target;
    CaloriesTarget  caloriesTarget;
    private float proteinCalories;
    private float carbsCalories;
    private float fatsCalories;
    private float proteinGrams;
    private float carbsGrams;
    private float fatsGrams;
    public Macros(BasalMetabolism basalMetabolism,Target target, CaloriesTarget caloriesTarget) {
        this.basalMetabolism = basalMetabolism;
        this.target = target;
        this.caloriesTarget = caloriesTarget;
        this.calculateMacros();
    }
    public float getProteinCalories() {
        return proteinCalories;
    }
    public void setProteinCalories(float proteinCalories) {
        this.proteinCalories = proteinCalories;
    }
    public float getCarbsCalories() {
        return carbsCalories;
    }
    public void setCarbsCalories(float carbsCalories) {
        this.carbsCalories = carbsCalories;
    }
    public float getFatsCalories() {
        return fatsCalories;
    }
    public void setFatsCalories(float fatsCalories) {
        this.fatsCalories = fatsCalories;
    }

    public float getProteinGrams() {
        return proteinGrams;
    }

    public void setProteinGrams(float proteinGrams) {
        this.proteinGrams = proteinGrams;
    }

    public float getCarbsGrams() {
        return carbsGrams;
    }

    public void setCarbsGrams(float carbsGrams) {
        this.carbsGrams = carbsGrams;
    }

    public float getFatsGrams() {
        return fatsGrams;
    }

    public void setFatsGrams(float fatsGrams) {
        this.fatsGrams = fatsGrams;
    }

    private void calculateMacros() {
        Scanner scanner = new Scanner(System.in);
        askUserHowManyGramsOfProtein(scanner);
        askUserHowManyGramsOfFat(scanner);
        calculateCarbs();
    }
    private void askUserHowManyGramsOfProtein(Scanner scanner){
        float grams;
        switch (target.getTarget()){
            case GAIN_WEIGHT:
                System.out.println("How many grams of protein do you want to eat per Kg?");
                System.out.println("It must be between 1.6 and 2.2 grams per kg of body weight.");
                grams = scanner.nextFloat();
                while (grams < 1.6 || grams > 2.2){
                    System.out.println("Invalid choice. Please enter a number between 1.6 and 2.2:");
                    grams = scanner.nextFloat();
                }
                this.setProteinGrams(grams * this.basalMetabolism.getWeight());
                this.setProteinCalories(grams * this.basalMetabolism.getWeight() * 4);
                break;
            case LOSE_WEIGHT:
                System.out.println("How many grams of protein do you want to eat per Kg?");
                System.out.println("It must be between 2,5 and 3 grams per kg of body weight.");
                grams = scanner.nextFloat();
                while (grams < 2.5 || grams > 3){
                    System.out.println("Invalid choice. Please enter a number between 2.5 and 3:");
                    grams = scanner.nextFloat();
                }
                this.setProteinGrams(grams * this.basalMetabolism.getWeight());
                this.setProteinCalories(grams * this.basalMetabolism.getWeight() * 4);
                break;
        }
    }
    private void askUserHowManyGramsOfFat( Scanner scanner){
        float grams;
        switch (target.getTarget()){
            case GAIN_WEIGHT:
                System.out.println("How many grams of fats do you want to eat per Kg?");
                System.out.println("It must be between 0,8 and 1.5 grams per kg of body weight.");
                grams = scanner.nextFloat();
                while (grams < 0.8 || grams > 1.5){
                    System.out.println("Invalid choice. Please enter a number between 0.8 and 1.5:");
                    grams = scanner.nextFloat();
                }
                this.setFatsGrams(grams * this.basalMetabolism.getWeight());
                this.setFatsCalories(grams * this.basalMetabolism.getWeight() * 9);
                break;
            case LOSE_WEIGHT:
                System.out.println("How many grams of fats do you want to eat per Kg?");
                System.out.println("It must be between 0.6 and 1 grams per kg of body weight.");
                grams = scanner.nextFloat();
                while (grams < 0.6 || grams > 1){
                    System.out.println("Invalid choice. Please enter a number between 0.6 and 1:");
                    grams = scanner.nextFloat();
                }
                this.setFatsGrams(grams * this.basalMetabolism.getWeight());
                this.setFatsCalories(grams * this.basalMetabolism.getWeight() * 9);
                break;
        }
    }
    private void calculateCarbs(){
        this.setCarbsGrams((caloriesTarget.getCaloriesTarget() - (this.getProteinCalories() + this.getFatsCalories())) / 4);
        this.setCarbsCalories(caloriesTarget.getCaloriesTarget() - (this.getProteinCalories() + this.getFatsCalories()));
    }
}
