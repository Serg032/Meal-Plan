public class Macros {
    private float protein;
    private float fat;
    private float carbohydrates;
    private float calories;
    private Diet diet;

    public Macros(Diet diet){
        this.setDiet(diet);
        this.setCalories(this.diet.getCaloriesConsume());
        this.setCustomProtein();
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
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

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    private void setCustomProtein(){
        this.setProtein((float) (1.6 - (2.2 * this.diet.getWeight())));
    }

    private void setCustomFat(){
        this.setFat((float) (0.3 - (0.4 * this.diet.getWeight())));
    }
}
