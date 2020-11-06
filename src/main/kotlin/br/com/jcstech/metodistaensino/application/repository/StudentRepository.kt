package br.com.jcstech.metodistaensino.application.repository

import br.com.jcstech.metodistaensino.domain.Student
import br.com.jcstech.metodistaensino.domain.persistence.StudentDO
import org.springframework.stereotype.Component

@Component
class StudentRepository (val repository: IStudentRepository) {

    fun save(student: Student) {
        repository.save(StudentDO.fromStudent(student))
    }

}