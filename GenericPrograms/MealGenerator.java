interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    private T type;
    public Meal(T type) { this.type = type; }
}

class MealGenerator {
    public static <T extends MealPlan> void generatePlan(T meal) {
        System.out.println("Generated: " + meal.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        generatePlan(new VeganMeal());
        generatePlan(new VegetarianMeal());
    }
}
