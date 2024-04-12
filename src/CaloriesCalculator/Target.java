package CaloriesCalculator;

import java.util.Scanner;

public class Target {
    private TargetChoice target;

    public Target() {
        this.askUserForTarget();
    }

    public TargetChoice getTarget() {
        return this.target;
    }

    public void setTarget(TargetChoice target) {
        this.target = target;
    }

    private void askUserForTarget() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your target?");
        System.out.println("1. Lose weight");
        System.out.println("2. Gain weight");
        System.out.println("Enter the number of your choice:");
        int choice = scanner.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please enter 1 or 2:");
            choice = scanner.nextInt();
        }
        if (choice == 1) {
            this.target = TargetChoice.LOSE_WEIGHT;
        } else {
            this.target = TargetChoice.GAIN_WEIGHT;
        }
    }
}
