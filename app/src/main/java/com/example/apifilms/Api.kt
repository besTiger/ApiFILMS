package com.example.apifilms

import com.example.apifilms.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "e8bf0a88d8c448b3069dca27bd1d7619",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}