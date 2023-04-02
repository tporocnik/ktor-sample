package de.poro.hello

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.helloRouting(){
    route("/hello") {
        get {
            call.respondText("Hello World!")
        }
    }
}