package com.oghenovo.todoapp.adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oghenovo.todoapp.databinding.ActivityRecyclerBinding
import com.oghenovo.todoapp.databinding.CountryItemsBinding
import com.oghenovo.todoapp.models.Country

class CountryAdapter (val countries: List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){

    class CountryViewHolder(var binding: CountryItemsBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind (country : Country){
            binding.continentTX.text=country.continent
            binding.countryTX.text=country.name
            binding.populationTX.text=country.population.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {

        val binding = CountryItemsBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {


        holder.bind(countries[position])
    }

    override fun getItemCount(): Int {
        
        return countries.size
    }
}