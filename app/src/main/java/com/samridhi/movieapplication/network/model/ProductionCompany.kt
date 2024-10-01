package com.samridhi.movieapplication.network.model

import java.io.Serializable

class ProductionCompany (
    val id: Int,
    val logo_path: String?,
    val name: String,
    val origin_country: String
): Serializable
