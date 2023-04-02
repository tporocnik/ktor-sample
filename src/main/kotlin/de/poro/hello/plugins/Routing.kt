package de.poro.hello.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import de.poro.hello.helloRouting

fun Application.configureRouting() {
    routing {
       helloRouting()
	}
}
