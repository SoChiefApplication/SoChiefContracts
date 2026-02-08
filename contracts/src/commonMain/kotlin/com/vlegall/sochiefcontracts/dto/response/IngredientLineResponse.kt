package com.vlegall.sochiefcontracts.dto.response

data class IngredientLineResponse(
    val ingredient: IngredientResponse,
    val unit: UnitResponse?,
    val quantity: Double
)
