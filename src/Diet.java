import java.util.Scanner;

public class Diet {
    private final Scanner scanner = new Scanner(System.in);

    private float weight;
    private Target target;
    private DietIntensity dietIntensity;
    private ActivityLevel activityLevel;
    private float basalMetabolism;
    private float activityIndex;
    private float caloricWaste;
    private float caloriesConsume;

    public float getActivityIndex() {
        return activityIndex;
    }

    public void setActivityIndex(float activityIndex) {
        this.activityIndex = activityIndex;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }

    public DietIntensity getDietIntensity() {
        return dietIntensity;
    }

    public float getCaloricWaste() {
        return caloricWaste;
    }

    public void setCaloricWaste(float caloricWaste) {
        this.caloricWaste = caloricWaste;
    }

    public void setDietIntensity(DietIntensity dietIntensity) {
        this.dietIntensity = dietIntensity;
    }

    public float getBasalMetabolism() {
        return basalMetabolism;
    }

    public void setBasalMetabolism(float basalMetabolism) {
        this.basalMetabolism = basalMetabolism;
    }

    public float getCaloriesConsume() {
        return caloriesConsume;
    }

    public void setCaloriesConsume(float caloriesConsume) {
        this.caloriesConsume = caloriesConsume;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float basalMetabolismCalculation(){
        System.out.println("Enter your weight in kg: ");
        this.setWeight(scanner.nextFloat());
        this.setBasalMetabolism(22 * this.getWeight());
        System.out.println(this.basalMetabolism);
        return this.getBasalMetabolism();
    }

    public void setUserCaloricWaste(){
        this.setCaloricWaste(this.getBasalMetabolism() * this.setUserActivityIndex());
    }

    public float setUserActivityIndex(){
        if (this.getDietIntensity() == DietIntensity.light){
            if (this.getActivityLevel() == ActivityLevel.Sedentary){
                this.setActivityIndex(1.2f);
                System.out.println("Light Sedentary" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.SomewhatActive){
                this.setActivityIndex(1.5f);
                System.out.println("Light SomewhatActive" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.Active){
                this.setActivityIndex(1.7f);
                System.out.println("Light Active" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.VeryActive){
                this.setActivityIndex(1.9f);
                System.out.println("Light VeryActive" + this.getActivityIndex());

            }
        } else if (this.getDietIntensity() == DietIntensity.normal){
            if (this.getActivityLevel() == ActivityLevel.Sedentary){
                this.setActivityIndex(1.5f);
                System.out.println("Normal Sedentary" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.SomewhatActive){
                this.setActivityIndex(1.6f);
                System.out.println("Normal SomewhatActive" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.Active){
                this.setActivityIndex(1.85f);
                System.out.println("Normal Active" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.VeryActive){
                this.setActivityIndex(2f);
                System.out.println("Normal VeryActive" + this.getActivityIndex());
            }
        } else if (this.getDietIntensity() == DietIntensity.intense){
            if (this.getActivityLevel() == ActivityLevel.Sedentary){
                this.setActivityIndex(1.6f);
                System.out.println("Intense Sedentary" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.SomewhatActive){
                this.setActivityIndex(1.8f);
                System.out.println("Intense SomewhatActive" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.Active){
                this.setActivityIndex(2f);
                System.out.println("Intense Active" + this.getActivityIndex());
            } else if (this.getActivityLevel() == ActivityLevel.VeryActive){
                this.setActivityIndex(2.2f);
                System.out.println("Intense VeryActive" + this.getActivityIndex());
            }
        }
        return this.getActivityIndex();
    }

    public Target setUserTarget(){
        System.out.println("""
                Enter your target:\s
                enter 1 to set Gains
                enter 2 to set LossWeight"""
        );
        String target = scanner.nextLine();
        switch (target){
            case "1":
                setTarget(Target.Gains);
                System.out.println("Gains");
                break;
            case "2":
                setTarget(Target.LossWeight);
                System.out.println("Loss Weight");
                break;
            default:
                System.out.println("Invalid target");
        }

        return this.getTarget();
    }

    public void setUserDietIntensity(){
        System.out.println("""
                Enter your diet intensity:\s
                enter 1 to set light
                enter 2 to set normal
                enter 3 to set intense"""
        );
        String dietIntensity = scanner.nextLine();
        switch (dietIntensity){
            case "1":
                setDietIntensity(DietIntensity.light);
                System.out.println("Light");
                break;
            case "2":
                setDietIntensity(DietIntensity.normal);
                System.out.println("Normal");
                break;
            case "3":
                setDietIntensity(DietIntensity.intense);
                System.out.println("Intense");
                break;
            default:
                System.out.println("Invalid diet intensity");
        }
    }

    public void setUserActivityLevel(){
        System.out.println("""
                Enter your activity level:\s
                enter 1 to set Sedentary
                enter 2 to set SomewhatActive
                enter 3 to set Active
                enter 4 to set VeryActive"""
        );
        String activityLevel = scanner.nextLine();
        switch (activityLevel){
            case "1":
                setActivityLevel(ActivityLevel.Sedentary);
                System.out.println("Sedentary");
                break;
            case "2":
                setActivityLevel(ActivityLevel.SomewhatActive);
                System.out.println("Somewhat Active");
                break;
            case "3":
                setActivityLevel(ActivityLevel.Active);
                System.out.println("Active");
                break;
            case "4":
                setActivityLevel(ActivityLevel.VeryActive);
                System.out.println("Very Active");
                break;
            default:
                System.out.println("Invalid activity level");
        }
    }

    public void setUserCaloriesConsume(){
        if (this.getTarget() == Target.Gains){
            if (this.getDietIntensity() == DietIntensity.light){
                this.setCaloriesConsume(this.getCaloricWaste() + 200);
            } else if (this.getDietIntensity() == DietIntensity.normal){
                this.setCaloriesConsume(this.getCaloricWaste() + 300);
            } else if (this.getDietIntensity() == DietIntensity.intense){
                this.setCaloriesConsume(this.getCaloricWaste() + 500);
            }
        } else if (this.getTarget() == Target.LossWeight){
            if (this.getDietIntensity() == DietIntensity.light){
                this.setCaloriesConsume(this.getCaloricWaste() - 200);
            } else if (this.getDietIntensity() == DietIntensity.normal){
                this.setCaloriesConsume(this.getCaloricWaste() - 300);
            } else if (this.getDietIntensity() == DietIntensity.intense){
                this.setCaloriesConsume(this.getCaloricWaste() - 400);
            }
        }
    }
}
