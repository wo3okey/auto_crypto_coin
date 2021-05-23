package com.wookey.project.controller.form

import com.wookey.project.service.HomeService
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HomeController(private val homeService: HomeService) {

    @GetMapping("/")
    fun index(model: Model): String {
        model["title"] = "testTitle1"
        return "index"
    }

    @GetMapping("/balance")
    fun test(model: Model): String {
        model["title"] = "testTitle2"
        return "index"
    }
}