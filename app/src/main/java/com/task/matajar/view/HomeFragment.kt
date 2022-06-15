package com.task.matajar.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.task.matajar.ViewModelFactory
import com.task.matajar.adapters.MetajarAdapter
import com.task.matajar.databinding.FragmentHomeBinding
import com.task.matajar.model.post.MetaPost
import com.task.matajar.repository.Repository
import com.task.matajar.viewModel.MainViewModel

class HomeFragment : Fragment() {

    private lateinit var grocertAdapter: MetajarAdapter
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val repository = Repository()

        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        suspend {
            viewModel.getResponsePost(
                post = MetaPost(
                    intPageLimit = 2,
                    strStoreId = "",
                    intSkipCount = 1,
                    blnExpress = true,
                    strSubCategoryId = "6232def93142bf316c2ed43a"
                )
            )
        }

        grocertAdapter = MetajarAdapter(context)
        binding.homeRecycler.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = grocertAdapter
        }

        viewModel.respose.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (it.isSuccessful) {
                Log.d("Res", it.message().toString())
                Log.d("Res", it.code().toString())
                Log.d("Res", it.body().toString())
            } else {
                Toast.makeText(context, "not success", Toast.LENGTH_LONG).show()
            }
        })

        return binding.root
    }
}