import BasalMetabolism.BasalMetabolismCalculator;
import Target.Target;
import Target.TargetChoice;

public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        TargetChoice choice = target.getTarget();
        System.out.println("Your target is: " + choice);
        BasalMetabolismCalculator basalMetabolismCalculator = new BasalMetabolismCalculator();
    }
}
