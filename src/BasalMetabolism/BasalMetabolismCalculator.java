package BasalMetabolism;

import java.util.Scanner;

public class BasalMetabolismCalculator {

    private float basalMetabolism;
    private float weight;

    public BasalMetabolismCalculator(){
        this.askUserWeight();
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
        // Peso x 22
        /*
        *  Valores segun actividad
            - Sedentario: 1,3 - 1,6
            - Algo activo 1,5 - 1-8
            - Activo 1,7 - 2
            - Muy Activo 1,9 - 2,2

            - Mutiplicacion de MB por valor de actividad
            - 1914 x 1,6 (algo activo) = 3062 Kal de gasto al dia
	    * */
        float basalMetabolism = 22 * this.getWeight();
        this.setBasalMetabolism(basalMetabolism);
    }
}
