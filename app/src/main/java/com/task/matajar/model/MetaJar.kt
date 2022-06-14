package com.task.matajar.model

import com.task.matajar.model.Data

data class MetaJar(
    val count: Int,
    val `data`: List<Data>,
    val message: String,
    val success: Boolean
)