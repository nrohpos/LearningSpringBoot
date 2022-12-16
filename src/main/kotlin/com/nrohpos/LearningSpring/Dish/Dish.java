package com.nrohpos.LearningSpring.Dish;

import com.nrohpos.LearningSpring.Base.BaseModel;
import jakarta.persistence.*;

@Entity
@Table
public class Dish extends BaseModel {
    @Id
    @SequenceGenerator(
            name = "dish_sequence",
            sequenceName = "dish_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dish_sequence")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
