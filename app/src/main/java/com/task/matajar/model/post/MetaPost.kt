package com.task.matajar.model.post

data class MetaPost(
    val intPageLimit: Int,
    val strStoreId: String,
    val intSkipCount: Int,
    val blnExpress: Boolean,
    val strSubCategoryId: String
)
