package fr.vlegall.sochief.contracts.request

import kotlinx.serialization.Serializable

@Serializable
data class RecipeStepUpsertDto(
    val description: String? = null,
    val duration: String,
    val position: Int? = null
)
