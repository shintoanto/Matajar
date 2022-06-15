package com.task.matajar.repository

import android.util.Log
import com.task.matajar.api.RetroInstance
import com.task.matajar.model.Data
import com.task.matajar.model.post.MetaPost
import retrofit2.Response

class Repository {
        suspend fun getPost(post: MetaPost): Response<Data> {
            Log.d("Res", "repository")
            try {
              Log.d("Res","working")
            }catch (e:Exception){
                Log.d("Res",e.message.toString())
            }
            return RetroInstance.retrofitInstance.metaPost(post)
        }

}