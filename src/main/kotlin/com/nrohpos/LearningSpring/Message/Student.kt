package com.nrohpos.LearningSpring.Message

import jakarta.persistence.*
import org.hibernate.Hibernate
import java.time.LocalDate
import java.time.Period
import kotlin.jvm.Transient

@Entity
@Table
data class Student(
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    var id: Long? = null,
    var name: String? = null,
    var dob: LocalDate? = null,
    @Transient // will not create a colum/field in for table
    var age: Int? = dob?.let { Period.between(it, LocalDate.now()).years },
    var email: String? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Student

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , dob = $dob , age = $age )"
    }
}
