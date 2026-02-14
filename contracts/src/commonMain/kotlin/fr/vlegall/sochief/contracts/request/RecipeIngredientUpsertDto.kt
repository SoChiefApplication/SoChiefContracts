package fr.vlegall.sochief.contracts.request

import fr.vlegall.sochief.contracts.common.IdOrNameDto
import java.math.BigDecimal


data class RecipeIngredientUpsertDto(
    val ingredient: IdOrNameDto,
    val unit: IdOrNameDto,
    val quantity: BigDecimal
)

