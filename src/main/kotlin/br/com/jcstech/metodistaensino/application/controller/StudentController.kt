package br.com.jcstech.metodistaensino.application.controller

import br.com.jcstech.metodistaensino.application.repository.StudentRepository
import br.com.jcstech.metodistaensino.domain.*
import br.com.jcstech.metodistaensino.util.exceptions.ErrorMessage
import br.com.jcstech.metodistaensino.util.exceptions.ValidationException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/students")
class StudentController(val repository: StudentRepository) {

    @PostMapping
    fun createStudent(@RequestBody student: NewStudentDTO) {

        val fullName = FullName(student.firstName, student.lastName)
        val phoneNumber = PhoneNumber(student.phoneNumber)
        val birthDate = BirthDate(student.birthDate)

        val newStudent = Student(
                fullName
                , birthDate = birthDate
                , gender = student.gender
                , phoneNumber = phoneNumber
        )

        repository.save(newStudent)
    }

    @ExceptionHandler(ValidationException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun validationException(exception: ValidationException): ErrorMessage {
        return ErrorMessage(HttpStatus.BAD_REQUEST.value(), exception.message)
    }


}