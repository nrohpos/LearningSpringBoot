package com.nrohpos.LearningSpring.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    void getAllCategories() {
        categoryRepository.findAll();
    }


}
