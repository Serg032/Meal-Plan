package BasalMetabolism;

import java.util.Scanner;

public class BasalMetabolism {

    private float basalMetabolism;
    private float weight;

    public BasalMetabolism(){
        this.askUserWeight();
        this.calculateBasalMetabolism();
    }

    public float getBasalMetabolism() {
        return basalMetabolism;
    }

    public void setBasalMetabolism(float basalMetabolism) {
        this.basalMetabolism = basalMetabolism;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private void askUserWeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        float weight = scanner.nextFloat();
        this.setWeight(weight);
    }

    private void calculateBasalMetabolism(){
        float basalMetabolism = 22 * this.getWeight();
        this.setBasalMetabolism(basalMetabolism);
    }
}
