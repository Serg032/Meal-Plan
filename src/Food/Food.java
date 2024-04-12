package Food;

public class Food {
    private float calories;
    private float protein;
    private float fat;
    private float carbohydrates;
    private float weight;
    private int units;

    public Food(float calories, float protein, float fat, float carbohydrates, float weight, int units){
        this.setCalories(calories);
        this.setProtein(protein);
        this.setFat(fat);
        this.setCarbohydrates(carbohydrates);
        this.setWeight(weight);
        this.setUnits(units);
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(float carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}
