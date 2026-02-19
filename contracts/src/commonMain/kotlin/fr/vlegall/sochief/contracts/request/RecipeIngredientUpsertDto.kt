package fr.vlegall.sochief.contracts.request

import fr.vlegall.sochief.contracts.common.BigDecimalSerializer
import fr.vlegall.sochief.contracts.common.IdOrNameDto
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class RecipeIngredientUpsertDto(
    val ingredient: IdOrNameDto,
    val unit: IdOrNameDto,
    @Serializable(with = BigDecimalSerializer::class)
    val quantity: BigDecimal
)

