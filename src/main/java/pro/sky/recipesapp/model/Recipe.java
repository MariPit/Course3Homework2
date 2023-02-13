package pro.sky.recipesapp.model;

import java.util.List;
import java.util.Objects;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<Ingredient> ingredients;
    private List<String> steps;

    public Recipe(String name, int cookingTime, List<Ingredient> ingredients, List<String> steps) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipes = (Recipe) o;
        return cookingTime == recipes.cookingTime && name.equals(recipes.name) && ingredients.equals(recipes.ingredients) && steps.equals(recipes.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cookingTime, ingredients, steps);
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "name='" + name + '\'' +
                ", cookingTime=" + cookingTime +
                ", ingredients=" + ingredients +
                ", steps=" + steps +
                '}';
    }
}
