package com.diva.themoviedb.service

import com.diva.themoviedb.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/movie/popular?api_key=845df85541d2c710f03b01e2107bedeb")
    fun geTVList(): Call<TVResponse>
}