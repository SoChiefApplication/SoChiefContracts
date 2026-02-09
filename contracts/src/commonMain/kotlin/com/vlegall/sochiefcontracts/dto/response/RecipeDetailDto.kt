package com.vlegall.sochiefcontracts.dto.response

import com.vlegall.sochiefcontracts.dto.common.NamedIdDto

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
