package assignment6.builder;

public class MainClass {
    public static void main(String[] args) {
        NutritionFactBuilder nutritionFactBuilder = new NutritionFactBuilder();
        NutritionFacts nutritionFacts = nutritionFactBuilder.buildNutritionFacts();
        System.out.println(nutritionFacts);
    }
}
