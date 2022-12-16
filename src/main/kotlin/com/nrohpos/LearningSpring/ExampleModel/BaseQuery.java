package com.nrohpos.LearningSpring.ExampleModel;

import java.util.ArrayList;
import java.util.List;

public class BaseQuery<T> {

    List<T> getAllItems() {
        return new ArrayList<>();
    }
}
