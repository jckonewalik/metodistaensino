package br.com.jcstech.metodistaensino.util.exceptions

import java.time.LocalDateTime

class ErrorMessage(val code: Int, val message: String? = "") {
    val timestamp: LocalDateTime = LocalDateTime.now()
}