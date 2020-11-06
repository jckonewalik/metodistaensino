package br.com.jcstech.metodistaensino.application.repository

import br.com.jcstech.metodistaensino.domain.persistence.StudentDO
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface IStudentRepository: JpaRepository<StudentDO, UUID>