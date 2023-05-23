package com.example.apitesting

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.MainActivityAdapter
import com.example.finalproject.databinding.ActivityMainBinding
import com.example.finalproject.retrofit.RetrofitBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        CoroutineScope(Dispatchers.Main).launch{

            kotlin.runCatching {
                RetrofitBuilder.retrofitCall.getAllJoke()
            }.onSuccess {
                val adapter = MainActivityAdapter()
                adapter.submitList(it)
                binding.viewAdapter.adapter = adapter
            }.onFailure {
                Toast.makeText(applicationContext,"$it", Toast.LENGTH_LONG).show()
            }


        }

    }

}
