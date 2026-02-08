package com.vlegall.sochiefcontracts.dto.request

data class IngredientLineRequest(
    val ingredientId: Long,
    val unitId: Long? = null,
    val quantity: Double
)
