package pro.sky.recipesapp.service;

import org.springframework.stereotype.Service;
import pro.sky.recipesapp.model.Ingredient;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {
    private static long idCounter = 1;
    private final Map<Long, Ingredient> ingredients = new HashMap<>();

    @Override
    public Ingredient save(Ingredient ingredient) {
        return ingredients.put(idCounter++, ingredient);
    }

    @Override
    public Optional<Ingredient> getByID(Long id) {
        ingredients.get(id);
        return Optional.empty();
    }
}
