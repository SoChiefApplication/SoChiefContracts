package fr.vlegall.sochief.contracts.request

data class RecipeStepUpsertDto(
    val description: String? = null,
    val duration: String,
    val position: Int? = null
)
