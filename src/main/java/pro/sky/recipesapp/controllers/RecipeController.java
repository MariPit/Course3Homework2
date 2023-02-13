package pro.sky.recipesapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Recipe;
import pro.sky.recipesapp.service.RecipeService;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity<Recipe> save (@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.save(recipe));
    }

    @GetMapping
    public ResponseEntity<Recipe> getById (@PathVariable Long id) {
        return ResponseEntity.of(recipeService.getByID(id));
    }
}
