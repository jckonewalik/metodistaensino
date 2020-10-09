package br.com.jcstech.metodistaensino

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = arrayOf(DataSourceAutoConfiguration::class))
class MetodistaensinoApplication

fun main(args: Array<String>) {
	runApplication<MetodistaensinoApplication>(*args)
}
