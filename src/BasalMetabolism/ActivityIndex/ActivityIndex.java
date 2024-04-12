package BasalMetabolism.ActivityIndex;

import java.util.Scanner;

public class ActivityIndex {
    private float index;
    private ActivityChoice activityChoice;

    public ActivityIndex(float index) {
        this.index = index;
    }

    public float getIndex() {
        return index;
    }

    public void setIndex(float index) {
        this.index = index;
    }

    public ActivityChoice getActivityChoice() {
        return activityChoice;
    }

    public void setActivityChoice(ActivityChoice activityChoice) {
        this.activityChoice = activityChoice;
    }

    private void askUserActivityIndex(){
        Scanner scanner = new Scanner(System.in);
        this.askUserActivity(scanner);
        ActivityChoice activityChoice = this.getActivityChoice();
        this.giveUserActivityIndexChoicesAndSetActivityIndex(activityChoice, scanner);
    }

    private void askUserActivity(Scanner scanner){
        System.out.println("How is your activity?");
        System.out.println("1. Sedentary");
        System.out.println("2. Lightly active");
        System.out.println("3. Very active");
        System.out.println("4. Super active");
        System.out.println("Enter the number of your choice:");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please enter a number between 1 and 4:");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                this.activityChoice = ActivityChoice.SEDENTARY;
                break;
            case 2:
                this.activityChoice = ActivityChoice.LIGHTLY_ACTIVE;
                break;
            case 3:
                this.activityChoice = ActivityChoice.VERY_ACTIVE;
                break;
            case 4:
                this.activityChoice = ActivityChoice.SUPER_ACTIVE;
                break;
        }
    }

    private void giveUserActivityIndexChoicesAndSetActivityIndex(ActivityChoice activityChoice, Scanner scanner){
        switch (activityChoice){
            case SEDENTARY:
                System.out.println("Your activity index is 1.3 - 1.6");
                float index = scanner.nextFloat();
                while (index < 1.3 || index > 1.6) {
                    System.out.println("Invalid index. Please enter a number between 1.3 and 1.6:");
                    index = scanner.nextFloat();
                }
                this.setIndex(index);
                break;
                case LIGHTLY_ACTIVE:
                System.out.println("Your activity index is 1.5 - 1.8");
                index = scanner.nextFloat();
                while (index < 1.5 || index > 1.8) {
                    System.out.println("Invalid index. Please enter a number between 1.5 and 1.8:");
                    index = scanner.nextFloat();
                }
                this.setIndex(index);
                break;
                case VERY_ACTIVE:
                System.out.println("Your activity index is 1.7 - 2");
                index = scanner.nextFloat();
                while (index < 1.7 || index > 2) {
                    System.out.println("Invalid index. Please enter a number between 1.7 and 2:");
                    index = scanner.nextFloat();
                }
                this.setIndex(index);
                break;
                case SUPER_ACTIVE:
                System.out.println("Your activity index is 1.9 - 2.2");
                index = scanner.nextFloat();
                while (index < 1.9 || index > 2.2) {
                    System.out.println("Invalid index. Please enter a number between 1.9 and 2.2:");
                    index = scanner.nextFloat();
                }
                this.setIndex(index);
                break;
        }
    }
}
