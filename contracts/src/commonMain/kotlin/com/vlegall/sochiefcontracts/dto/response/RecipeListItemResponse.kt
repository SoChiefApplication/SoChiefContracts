package com.vlegall.sochiefcontracts.dto.response

data class RecipeListItemResponse(
    val id: Long,
    val name: String,
    val description: String?,
    val category: CategoryResponse,
    val servings: Int,
    val tags: List<TagResponse>
)
