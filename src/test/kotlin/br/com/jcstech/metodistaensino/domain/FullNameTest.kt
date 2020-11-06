package br.com.jcstech.metodistaensino.domain

import br.com.jcstech.metodistaensino.util.exceptions.ValidationException
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test

const val VALID_NAME = "João"
const val VALID_LAST_NAME = "Souza"
const val INVALID_NAME = "Fist Name too much big with more than 50 characters"
const val INVALID_LAST_NAME = "Last Name too much big with more than 50 characters"

class FullNameTest {

    @Test
    fun should_throw_an_exception_when_first_name_is_bigger_than_50() {
        val exception = assertThrows<ValidationException> {
            FullName(firstName = INVALID_NAME
                    , lastName = VALID_NAME)
        }
        assertEquals("First name must have 50 characters maximum", exception.message)

    }

    @Test
    fun should_throw_an_exception_when_last_name_is_bigger_than_50() {
        val exception = assertThrows<ValidationException> {
            FullName(firstName = VALID_NAME
                    , lastName = INVALID_LAST_NAME)
        }
        assertEquals("Last name must have 50 characters maximum", exception.message)
    }

    @Test
    fun should_throw_an_exception_when_fist_name_is_empty() {
        val exception = assertThrows<ValidationException> {
            FullName(firstName = ""
                    , lastName = VALID_LAST_NAME)
        }
        assertEquals("Fist name cannot be empty", exception.message)
    }

    @Test
    fun should_throw_an_exception_when_last_name_is_empty() {
        val exception = assertThrows<ValidationException> {
            FullName(firstName = VALID_NAME
                    , lastName = "")
        }
        assertEquals("Last name cannot be empty", exception.message)
    }
}