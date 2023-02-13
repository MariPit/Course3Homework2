package pro.sky.recipesapp.service;

import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Ingredient;
import pro.sky.recipesapp.model.Recipe;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    private static long idCounter = 1;
    private final Map<Long, Recipe> recipes = new HashMap<>();
    @Override
    public Recipe save(Recipe recipe) {
        return recipes.put(idCounter++, recipe);
    }

    @Override
    public Optional<Recipe> getByID(Long id) {
        recipes.get(id);
        return Optional.empty();
    }
}
