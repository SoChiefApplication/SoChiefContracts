package fr.vlegall.sochief.contracts.response

import fr.vlegall.sochief.contracts.common.NamedIdDto
import kotlinx.serialization.Serializable

@Serializable
data class RecipeListItemDto(
    val id: Long,
    val title: String,
    val category: NamedIdDto,
    val difficulty: NamedIdDto,
    val initialPortions: Int,
    val preparationTime: String,
    val cookingTime: String
)