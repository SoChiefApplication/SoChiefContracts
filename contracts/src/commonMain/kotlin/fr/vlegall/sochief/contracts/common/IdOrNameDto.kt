package fr.vlegall.sochief.contracts.common

import kotlinx.serialization.Serializable

@Serializable
data class IdOrNameDto(
    val id: Long? = null,
    val name: String? = null
)