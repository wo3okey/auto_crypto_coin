package com.wookey.project.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class HomeService(private val restTemplate: RestTemplate) {
    fun getApi(): String {
        return restTemplate.getForObject("http://54.180.156.31:1005/xrp", String::class)
    }
}


