package fr.vlegall.sochief.contracts.response

import kotlinx.serialization.Serializable

@Serializable
data class RecipeStepDto(
    val id: Long?,
    val description: String?,
    val duration: String,
    val position: Int
)
