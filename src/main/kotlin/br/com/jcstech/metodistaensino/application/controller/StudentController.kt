package br.com.jcstech.metodistaensino.application.controller

import br.com.jcstech.metodistaensino.application.repository.StudentRepository
import br.com.jcstech.metodistaensino.domain.NewStudentDTO
import br.com.jcstech.metodistaensino.domain.Student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(val repository: StudentRepository) {

    @PostMapping
    fun createStudent(@RequestBody student: NewStudentDTO) {

        val newStudent = Student(firstName = student.firstName
                , lastName = student.lastName
                , birthDate = student.birthDate
                , gender = student.gender
                , phoneNumber = student.phoneNumber
        )

        repository.save(newStudent)


    }

}