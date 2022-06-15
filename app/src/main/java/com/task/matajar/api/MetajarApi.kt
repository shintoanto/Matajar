package com.task.matajar.api

import com.task.matajar.model.Data
import com.task.matajar.model.MetaJar
import com.task.matajar.model.post.MetaPost
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface MetajarApi {

    @POST("v2/api/product/get_product_under_sub_category")
    suspend fun metaPost(
        @Body post: MetaPost
    ): Response<MetaJar>
}