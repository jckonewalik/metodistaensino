package br.com.jcstech.metodistaensino.domain

import java.time.LocalDate

class NewStudentDTO (val firstName: String
                     , val lastName: String
                     , val birthDate: LocalDate
                     , val gender: Gender
                     , val phoneNumber: String)
