package fr.vlegall.sochief.contracts.response

import fr.vlegall.sochief.contracts.common.BigDecimalSerializer
import fr.vlegall.sochief.contracts.common.NamedIdDto
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class RecipeIngredientDto(
    val ingredient: NamedIdDto,
    val unit: NamedIdDto,
    @Serializable(with = BigDecimalSerializer::class)
    val quantity: BigDecimal
)
