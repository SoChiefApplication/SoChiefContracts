package fr.vlegall.sochief.contracts.response

import fr.vlegall.sochief.contracts.common.NamedIdDto
import java.math.BigDecimal

data class RecipeIngredientDto(
    val ingredient: NamedIdDto,
    val unit: NamedIdDto,
    val quantity: BigDecimal
)
