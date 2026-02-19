package fr.vlegall.sochief.contracts.request

import fr.vlegall.sochief.contracts.common.IdOrNameDto
import kotlinx.serialization.Serializable

@Serializable
data class RecipeUpsertRequestDto(
    val title: String,
    val description: String? = null,
    val categoryId: Long,
    val difficultyId: Long,
    val initialPortions: Int,
    val preparationTime: String,
    val cookingTime: String,
    val ingredients: List<RecipeIngredientUpsertDto>,
    val steps: List<RecipeStepUpsertDto>,
    val tags: List<IdOrNameDto> = emptyList(),
    val utensils: List<IdOrNameDto> = emptyList(),
)