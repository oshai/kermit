package com.outbrain.amplify.api

fun main(args : Array<String>) {
    val token = "42"
    val api = AmplifyApiClient(token)
    println(api.marketers().id("id").get())
}