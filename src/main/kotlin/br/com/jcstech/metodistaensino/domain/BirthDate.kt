package br.com.jcstech.metodistaensino.domain

import br.com.jcstech.metodistaensino.util.exceptions.ValidationException
import java.time.LocalDate

class BirthDate (date: LocalDate) {

    val value: LocalDate

    init {
        if (!date.isBefore(LocalDate.now())) {
            throw ValidationException("Birth date cannot be higher than the current date")
        }
        this.value = date
    }

}
