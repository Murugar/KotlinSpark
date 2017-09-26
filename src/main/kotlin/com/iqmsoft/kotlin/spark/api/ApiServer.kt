@file:JvmName("ApiServer")
package com.iqmsoft.kotlin.spark.api

import com.iqmsoft.kotlin.spark.api.controller.PingController
import spark.Spark.get


fun main(args : Array<String>) {
    val pingController : PingController = PingController()
    get("/test", { request, response -> pingController.handle(request, response) })
}

