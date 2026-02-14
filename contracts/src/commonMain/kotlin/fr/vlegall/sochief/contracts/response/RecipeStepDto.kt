package fr.vlegall.sochief.contracts.response

data class RecipeStepDto(
    val id: Long?,
    val description: String?,
    val duration: String,
    val position: Int
)
