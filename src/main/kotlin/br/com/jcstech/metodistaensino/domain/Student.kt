package br.com.jcstech.metodistaensino.domain

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

class Student(
        val fullName: FullName
        , val birthDate: BirthDate
        , val gender: Gender
        , val phoneNumber: PhoneNumber) {

    @Id
    val id: UUID = UUID.randomUUID()

    val createDate = LocalDateTime.now()
    val createUser = "jckonewalik@gmail.com"
    val updateDate = LocalDateTime.now()
    val updateUser = "jckonewalik@gmail.com"
}
