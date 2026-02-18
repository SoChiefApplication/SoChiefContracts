package fr.vlegall.sochief.contracts.response

import kotlinx.serialization.Serializable

@Serializable
data class ApiStatus(
    val service: String,
    val env: String? = null,
    val version: String? = null,
)
