import BasalMetabolism.BasalMetabolism;
import BasalMetabolismMultipliedByActivity.BasalMetabolismMultipliedByActivity;
import Target.Target;
import Target.TargetChoice;

public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        TargetChoice choice = target.getTarget();
        System.out.println("Your target is: " + choice);
        BasalMetabolism basalMetabolism = new BasalMetabolism();
        System.out.println("Your basal metabolism is: " + basalMetabolism.getBasalMetabolism());
        BasalMetabolismMultipliedByActivity basalMetabolismMultipliedByActivity = new BasalMetabolismMultipliedByActivity(basalMetabolism);
        System.out.println("Your basal metabolism multiplied by activity index is: " + basalMetabolismMultipliedByActivity.getBasalMetabolismMultipliedByActivity());
    }
}
