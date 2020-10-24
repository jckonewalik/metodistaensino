package br.com.jcstech.metodistaensino.application.repository

import br.com.jcstech.metodistaensino.domain.Student
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface StudentRepository: JpaRepository<Student, UUID> {
}