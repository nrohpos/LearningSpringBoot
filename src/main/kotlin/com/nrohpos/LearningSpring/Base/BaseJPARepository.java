package com.nrohpos.LearningSpring.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseJPARepository<BaseModel> extends JpaRepository<BaseModel, Long> {

}
