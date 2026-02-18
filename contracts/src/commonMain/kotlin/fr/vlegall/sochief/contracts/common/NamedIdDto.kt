package fr.vlegall.sochief.contracts.common

import kotlinx.serialization.Serializable

@Serializable
data class NamedIdDto(
    val id: Long,
    val name: String
)