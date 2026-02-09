package com.vlegall.sochiefcontracts.dto.response

import com.vlegall.sochiefcontracts.dto.common.NamedIdDto
import java.math.BigDecimal

data class RecipeIngredientDto(
    val ingredient: NamedIdDto,
    val unit: NamedIdDto,
    val quantity: BigDecimal
)
