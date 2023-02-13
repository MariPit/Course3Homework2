package pro.sky.recipesapp.service;

import pro.sky.recipesapp.model.Recipe;

import java.util.Optional;

public interface RecipeService {
    Recipe save(Recipe recipe);
    Optional<Recipe> getByID(Long id);
}
