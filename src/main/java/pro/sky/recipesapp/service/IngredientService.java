package pro.sky.recipesapp.service;

import pro.sky.recipesapp.model.Ingredient;

import java.util.Optional;

public interface IngredientService {
    Ingredient save(Ingredient ingredient);
    Optional<Ingredient> getByID(Long id);
}
