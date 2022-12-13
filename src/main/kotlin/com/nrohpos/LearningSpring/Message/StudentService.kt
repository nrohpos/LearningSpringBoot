package com.nrohpos.LearningSpring.Message

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service//@Component
class StudentService @Autowired constructor(private val studentRepository: StudentRepository) {
    fun getStudents(): MutableList<Student> = studentRepository.findAll()

    fun addNewStudent(student: Student) {
        val resultStudent = studentRepository.findStudentByEmail(student.email)
        if (resultStudent.isPresent) {
            throw IllegalStateException("email Taken")
        }
        studentRepository.save(student)
    }

    fun deleteStudent(id: Long?) {
        if (id == null) {
            throw IllegalStateException("Invalid Id")
        }
        val isExists = studentRepository.existsById(id)

        if (!isExists) {
            throw IllegalStateException("Student with id of $id does not exists")
        }
        studentRepository.deleteById(id)
    }
}