package assignment6.builder;

public class NutritionFactBuilder {

    public NutritionFacts buildNutritionFacts(){
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setFats("highest");
        nutritionFacts.setProteins("very low");
        return nutritionFacts;
    }
}
