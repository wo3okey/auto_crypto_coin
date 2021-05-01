package com.wookey.project.auto_crypto_coin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {
    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "testTitle1"
        return "index"
    }

    @GetMapping("/test")
    fun test(model: Model): String {
        model["title"] = "testTitle2"
        return "index"
    }

}