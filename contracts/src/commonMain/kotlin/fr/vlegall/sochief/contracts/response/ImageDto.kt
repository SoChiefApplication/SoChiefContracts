package fr.vlegall.sochief.contracts.response

import kotlinx.serialization.Serializable

@Serializable
data class ImageDto(
    val url: String,
    val thumbnailUrl: String? = null
)