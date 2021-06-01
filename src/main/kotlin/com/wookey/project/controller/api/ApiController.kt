package com.wookey.project.controller.api

import com.wookey.project.service.HomeService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import kotlin.collections.HashMap
import kotlin.collections.Map
import kotlin.collections.set

@RestController
class ApiController(private val homeService: HomeService) {

    @GetMapping("/balance/{coin}")
    @ResponseBody
    fun getBalance(model: Model, @PathVariable coin: String): Map<String, String> {
        var result: HashMap<String, String> = HashMap()
        var balance = homeService.getBalance(coin)

        result[coin] = balance
        return result
    }

    @GetMapping("/balance2/{coin}")
    @ResponseBody
    fun getBalance2(model: Model, @PathVariable coin: String): String {
        return homeService.getBalance(coin)
    }
}