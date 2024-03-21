package com.bottomnavigation.adopter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bottomnavigation.R
import com.bottomnavigation.data.WeatherData

class WeatherCardAdapter(private val context: Context, private val weatherDataList: List<WeatherData>) : RecyclerView.Adapter<WeatherCardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_card_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val weatherData = weatherDataList[position]

        holder.locationTextView.text = weatherData.location
        // Set other weather data to corresponding views

        // You need to load actual weather icons based on weather condition
        holder.weatherIcon.setImageResource(R.drawable.weather_icon)
    }

    override fun getItemCount(): Int {
        return weatherDataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val weatherIcon: ImageView = itemView.findViewById(R.id.weatherIcon)
        val locationTextView: TextView = itemView.findViewById(R.id.locationTextView)
        // Initialize other views here
    }
}
