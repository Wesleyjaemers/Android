package com.example.vdabcursist.lesson_07_navigating_between_activities.data

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.vdabcursist.lesson_07_navigating_between_activities.R
import com.example.vdabcursist.lesson_07_navigating_between_activities.model.Place

class PlaceListAdapter (private val list: ArrayList<Place>, private val context: Context):RecyclerView.Adapter<PlaceListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


     inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(place: Place) {

            var country: TextView = itemView.findViewById(R.id.country_ID) as TextView

            var city: TextView = itemView.findViewById(R.id.city_ID) as TextView
            country.text = place.CountryName
            city.text = place.CityName

            itemView.setOnClickListener{
                Toast.makeText(context, country.text, Toast.LENGTH_SHORT).show()
            }
        }



    }

}