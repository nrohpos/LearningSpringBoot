package com.nrohpos.LearningSpring.ExampleModel;

import com.nrohpos.LearningSpring.Dish.Dish;

import java.util.List;

public class DishQuery extends BaseQuery<Dish> {

    @Override
    List<Dish> getAllItems() { // see how it change?
        return super.getAllItems(); // check what this function return
        // if you want another class to be use the same , just change the type
    }
}
