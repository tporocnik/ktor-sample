package de.poro.hello

import kotlinx.serialization.Serializable

@Serializable
data class Hello(val greeting: String)