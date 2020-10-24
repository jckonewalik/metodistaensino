package br.com.jcstech.metodistaensino.domain

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "students")
class Student(
        val firstName: String
        , val lastName: String
        , val birthDate: LocalDate
        , val gender: String
        , val phoneNumber: String) {

    @Id
    val id: UUID = UUID.randomUUID()

    val createDate = LocalDateTime.now()
    val createUser = "jckonewalik@gmail.com"
    val updateDate = LocalDateTime.now()
    val updateUser = "jckonewalik@gmail.com"

}
