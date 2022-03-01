package assignment6.builder;

final class NutritionFacts {
    private String fats;
    private String carbohydrates;
    private String proteins;
    private String vitamins;

    public NutritionFacts setFats(String fats) {
        this.fats = fats;
        return this;
    }

    public NutritionFacts setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
        return this;
    }

    public NutritionFacts setProteins(String proteins) {
        this.proteins = proteins;
        return this;
    }

    public NutritionFacts setVitamins(String vitamins) {
        this.vitamins = vitamins;
        return this;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "fats='" + fats + '\'' +
                ", carbohydrates='" + carbohydrates + '\'' +
                ", proteins='" + proteins + '\'' +
                ", vitamins='" + vitamins + '\'' +
                '}';
    }
}
