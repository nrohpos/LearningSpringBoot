package com.nrohpos.LearningSpring.Dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/dish")
public class DishController {
    private final DishService dishService;

    @Autowired
    DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping
    void getCategories() {
        dishService.getDishBy(1);
    }
}
