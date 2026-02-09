package com.vlegall.sochiefcontracts.dto.request

import com.vlegall.sochiefcontracts.dto.common.IdOrNameDto
import java.math.BigDecimal


data class RecipeIngredientUpsertDto(
    val ingredient: IdOrNameDto,
    val unit: IdOrNameDto,
    val quantity: BigDecimal
)

