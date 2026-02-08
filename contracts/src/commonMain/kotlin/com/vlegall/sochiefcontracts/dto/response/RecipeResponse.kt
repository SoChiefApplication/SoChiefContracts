package com.vlegall.sochiefcontracts.dto.response

data class RecipeResponse(
    val id: Long,
    val name: String,
    val description: String?,
    val category: CategoryResponse,
    val servings: Int,
    val tags: List<TagResponse>,
    val ingredients: List<IngredientLineResponse>,
    val steps: List<StepResponse>
)
