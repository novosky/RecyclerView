package com.oghenovo.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.oghenovo.todoapp.adapters.CountryAdapter
import com.oghenovo.todoapp.databinding.ActivityRecyclerBinding
import com.oghenovo.todoapp.models.Country

class RecyclerActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityRecyclerBinding
    private lateinit var myCountryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerbinding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(recyclerbinding.root)

        val countries:List<Country> = listOf(
            Country(
                R.drawable.ic_brazil,
                "Brazil",
                "South America",
                12L
            ),
            Country(
                R.drawable.ic_china,
                "China",
                "Asia",
                23L
            ),
            Country(
                R.drawable.ic_united_kingdom,
                "United Kingdom",
                "Europe",
                21L
            ),
            Country(
                R.drawable.ic_united_states,
                "United States",
                "North America",
                29L
            ),
            Country(
                R.drawable.ic_nigeria,
                "Nigeria",
                "Africa",
                16L
            ),
            Country(
                R.drawable.ic_united_states,
                "United States",
                "North America",
                29L
            ),
            Country(
                R.drawable.ic_nigeria,
                "Nigeria",
                "Africa",
                16L
            )
        )
        myCountryAdapter = CountryAdapter(countries)
        recyclerbinding.countryRV.adapter = myCountryAdapter
    }
}