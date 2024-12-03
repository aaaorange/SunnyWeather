package com.sunnyweather.android.logic.model

import android.health.connect.datatypes.ExerciseRoute
import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
                 @SerializedName("formatted_address")val placeId: String)

data class Location(val lng: String, val lat: String)