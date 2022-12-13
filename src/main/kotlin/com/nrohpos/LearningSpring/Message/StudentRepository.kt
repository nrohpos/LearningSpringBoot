package com.nrohpos.LearningSpring.Message

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.Optional


@Repository
interface StudentRepository : JpaRepository<Student, Long> {

//    @Query("SELECT s FROM STUDENT s WHERE s.email = ?1")
    fun findStudentByEmail(email: String?): Optional<Student>

}