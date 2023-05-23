

package com.example.finalproject

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.finalproject.databinding.ActivityMainItemBinding
import com.example.finalproject.model.JokesYeah

class MainActivityAdapter(): RecyclerView.Adapter<MainActivityAdapter.ViewHolder>() {
    private lateinit var listApi: List<JokesYeah.JokesYeahItem>

    inner class ViewHolder(private val binding: ActivityMainItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun initContent(item: JokesYeah.JokesYeahItem) {
            binding.adapterText.text = item.punchline
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ActivityMainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listApi.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.initContent(listApi[position])
    }

    fun submitList(list: List<JokesYeah.JokesYeahItem>) {
        listApi = list
    }
}

