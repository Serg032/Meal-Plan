import CaloriesCalculator.Target;
import CaloriesCalculator.TargetChoice;

public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        TargetChoice choice = target.getTarget();
        System.out.println("Your target is: " + choice);
    }
}
