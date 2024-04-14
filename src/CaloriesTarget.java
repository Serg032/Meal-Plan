import java.util.Scanner;

public class CaloriesTarget {
    float caloriesTarget;
    Target target;
    BasalMetabolismMultipliedByActivity basalMetabolismMultipliedByActivity;
    int addedCalories;

    public CaloriesTarget(Target target, BasalMetabolismMultipliedByActivity basalMetabolismMultipliedByActivity) {
        this.target = target;
        this.basalMetabolismMultipliedByActivity = basalMetabolismMultipliedByActivity;
        this.askUserforTarget(target);
        this.calculateCaloriesTarget(basalMetabolismMultipliedByActivity);
    }

    public float getCaloriesTarget() {
        return caloriesTarget;
    }

    public void setCaloriesTarget(float caloriesTarget) {
        this.caloriesTarget = caloriesTarget;
    }

    public int getAddedCalories() {
        return addedCalories;
    }

    public void setAddedCalories(int addedCalories) {
        this.addedCalories = addedCalories;
    }

    private void askUserforTarget(Target target) {
        switch (target.getTarget()){
            case GAIN_WEIGHT:
                System.out.println("Your target is to gain weight.");
                this.askUserForGainWeightTarget();
                System.out.println("You have to eat " + this.getAddedCalories() + " more calories than your daily requirement.");
                break;
            case LOSE_WEIGHT:
                System.out.println("Your target is to lose weight.");
                this.askUserForLoseWeightTarget();
                System.out.println("You have to eat " + this.getAddedCalories() + " less calories than your daily requirement.");
                break;
        }
    }

    private void askUserForGainWeightTarget() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many calories do u want to add?");
        System.out.println("1. 200 calories");
        System.out.println("2. 300 calories");
        System.out.println("3. 400 calories");
        System.out.println("4. 500 calories");
        System.out.println("Enter the number of your choice:");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please enter 1, 2, 3 or 4:");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                this.setAddedCalories(200);
                break;
            case 2:
                this.setAddedCalories(300);
                break;
            case 3:
                this.setAddedCalories(400);
                break;
            case 4:
                this.setAddedCalories(500);
                break;
        }
    }

    private void askUserForLoseWeightTarget() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many calories do u want to subtract?");
        System.out.println("1. 200 calories");
        System.out.println("2. 300 calories");
        System.out.println("3. 400 calories");
        System.out.println("Enter the number of your choice:");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.println("Invalid choice. Please enter 1, 2 or 3:");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                this.setAddedCalories(-200);
                break;
            case 2:
                this.setAddedCalories(-300);
                break;
            case 3:
                this.setAddedCalories(-400);
                break;
        }
    }

    private void calculateCaloriesTarget(BasalMetabolismMultipliedByActivity basalMetabolismMultipliedByActivity) {
        this.setCaloriesTarget(basalMetabolismMultipliedByActivity.getBasalMetabolismMultipliedByActivity() + this.getAddedCalories());
    }
}
