package br.com.jcstech.metodistaensino.domain

import br.com.jcstech.metodistaensino.util.exceptions.ValidationException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test
import java.time.LocalDate

class BirthDateTest {

    @Test
    fun should_throw_an_exception_when_birth_date_is_higher_than_current_date() {
        val exception = assertThrows<ValidationException> {
            BirthDate(LocalDate.now().plusDays(1))
        }
        assertEquals("Birth date cannot be higher than the current date", exception.message)

    }
}