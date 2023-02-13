package pro.sky.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String applicationRun(){
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info(){
        return "Машенька. Рецепты. 04.02.2023. Сборник рецептов.";
    }
}
