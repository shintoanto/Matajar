package com.task.matajar.model

data class MetaJar(
    val count: Int,
    val `data`: List<Data>,
    val message: String,
    val success: Boolean
)