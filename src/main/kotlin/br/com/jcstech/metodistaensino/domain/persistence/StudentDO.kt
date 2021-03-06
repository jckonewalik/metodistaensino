package br.com.jcstech.metodistaensino.domain.persistence

import br.com.jcstech.metodistaensino.domain.Student
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "students")
class StudentDO(
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

    companion object {
        fun fromStudent(student: Student): StudentDO {
            return StudentDO(
                    student.fullName.firstName
                    , student.fullName.lastName
                    , student.birthDate.value
                    , student.gender.toString()
                    , student.phoneNumber.value
            )
        }
    }

}
