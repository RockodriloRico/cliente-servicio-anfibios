package com.ebc.cliente_servicio_anfibios.controller

import retrofit2.http.GET

//declaro conportamientos de interface que solo es GET
interface AnfibiosApiService {


    @GET("amphibians")
    suspend fun  getAnfibios(): List<Anfibio>



}