package com.vlegall.sochiefcontracts.dto.request

data class RecipeStepUpsertDto(
    val description: String? = null,
    val duration: String,
    val position: Int? = null
)
