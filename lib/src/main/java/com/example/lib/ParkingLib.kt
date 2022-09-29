package com.example.lib

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class ParkingLib {

    private val sayHello:String = "Hello op"

     fun sayhello():String{
        return sayHello
    }
    private val client = HttpClient()
    suspend fun getHtml(): String {
        val response: HttpResponse = client.get("https://fakestoreapi.com/products")
        return response.bodyAsText()
    }
}