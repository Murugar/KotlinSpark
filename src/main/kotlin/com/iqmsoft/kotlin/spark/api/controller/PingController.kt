package com.iqmsoft.kotlin.spark.api.controller

import spark.Request
import spark.Response


class PingController {

    fun handle(request: Request?, response: Response?): String {
        return "pong"
    }
}

