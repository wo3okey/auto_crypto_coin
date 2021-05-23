package com.wookey.project.service

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class HomeService(private val restTemplate: RestTemplate) {
    val logger = LoggerFactory.getLogger(HomeService::class.java)

    fun getBalance(coin: String): String {

        var result:String = restTemplate.getForObject("http://54.180.156.31:1005/coin/balance/${coin}", String::class)
        logger.info("result - {}", result)
        return result
    }
}


