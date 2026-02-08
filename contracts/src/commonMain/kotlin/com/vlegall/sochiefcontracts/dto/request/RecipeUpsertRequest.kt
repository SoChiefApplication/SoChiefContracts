package com.vlegall.sochiefcontracts.dto.request

data class RecipeUpsertRequest(
    val name: String,
    val description: String? = null,
    val categoryId: Long,
    val servings: Int,
    val tags: List<String> = emptyList(),
    val ingredients: List<IngredientLineRequest>,
    val steps: List<StepRequest>
)
