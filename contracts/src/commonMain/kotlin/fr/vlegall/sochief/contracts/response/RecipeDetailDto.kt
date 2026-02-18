package fr.vlegall.sochief.contracts.response

import fr.vlegall.sochief.contracts.common.NamedIdDto
import kotlinx.serialization.Serializable

@Serializable
data class RecipeDetailDto(
    val id: Long,
    val title: String,
    val description: String?,
    val category: NamedIdDto,
    val difficulty: NamedIdDto,
    val initialPortions: Int,
    val displayedPortions: Int,
    val preparationTime: String,
    val cookingTime: String,
    val ingredients: List<RecipeIngredientDto>,
    val steps: List<RecipeStepDto>,
    val tags: List<NamedIdDto>,
    val utensils: List<NamedIdDto>
)
