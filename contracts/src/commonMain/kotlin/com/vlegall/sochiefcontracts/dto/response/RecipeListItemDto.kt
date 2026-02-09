package com.vlegall.sochiefcontracts.dto.response

import com.vlegall.sochiefcontracts.dto.common.NamedIdDto


data class RecipeListItemDto(
    val id: Long,
    val title: String,
    val category: NamedIdDto,
    val difficulty: NamedIdDto,
    val initialPortions: Int,
    val preparationTime: String,
    val cookingTime: String
)