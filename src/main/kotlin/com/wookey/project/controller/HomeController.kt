package com.wookey.project.controller

import com.wookey.project.service.HomeService
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController(private val homeService: HomeService) {
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

    @GetMapping("/api")
    fun getApi(model: Model): String {
        model["title"] = homeService.getApi()
        return "index"
    }
}