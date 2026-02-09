package com.vlegall.sochiefcontracts.dto.request

import com.vlegall.sochiefcontracts.dto.common.IdOrNameDto

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