package com.nrohpos.LearningSpring.Message

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["api/v1/student"])
class StudentController @Autowired constructor(private val studentService: StudentService) {
    @GetMapping
    fun listOfStudents(): List<Student> = studentService.getStudents()

    @PostMapping("create")
    fun registerNewStudent(@RequestBody student: Student) {
        studentService.addNewStudent(student)
    }

    @DeleteMapping(path = ["{studentId}"])
    fun deleteStudent(@PathVariable("studentId") id: Long?) {
        studentService.deleteStudent(id)
    }
}