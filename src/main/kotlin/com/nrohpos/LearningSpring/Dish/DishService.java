package com.nrohpos.LearningSpring.Dish;

import com.nrohpos.LearningSpring.Category.Category;
import com.nrohpos.LearningSpring.Category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    private final DishRepository dishRepository;

    @Autowired
    DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }


    void getDishBy(long cateId) {
        dishRepository.findAll(); // where cate id
    }
}
