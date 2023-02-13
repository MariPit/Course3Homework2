package pro.sky.recipesapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.recipesapp.model.Ingredient;
import pro.sky.recipesapp.service.IngredientService;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public ResponseEntity<Ingredient> save (@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.save(ingredient));
    }

    @GetMapping
    public ResponseEntity<Ingredient> getById (@PathVariable Long id) {
        return ResponseEntity.of(ingredientService.getByID(id));
    }
}
