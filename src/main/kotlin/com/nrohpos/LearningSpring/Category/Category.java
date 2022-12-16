package com.nrohpos.LearningSpring.Category;

import com.nrohpos.LearningSpring.Base.BaseModel;
import jakarta.persistence.*;

@Entity
@Table
public class Category extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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