package com.nrohpos.LearningSpring.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseJPARepository<T> extends JpaRepository<T, Long> { // you can specify the type of T

}
