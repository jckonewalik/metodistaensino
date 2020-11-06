package br.com.jcstech.metodistaensino.domain

import br.com.jcstech.metodistaensino.util.exceptions.ValidationException

class FullName (firstName: String, lastName: String) {

    val firstName: String
    val lastName: String

    init {
        if (firstName.trim().isEmpty()) {
            throw ValidationException("Fist name cannot be empty")
        }
        if (lastName.trim().isEmpty()) {
            throw ValidationException("Last name cannot be empty")
        }
        if(firstName.length > 50) {
            throw ValidationException("First name must have 50 characters maximum")
        }
        if(lastName.length > 50) {
            throw ValidationException("Last name must have 50 characters maximum")
        }
        this.firstName = firstName
        this.lastName = lastName
    }
}
