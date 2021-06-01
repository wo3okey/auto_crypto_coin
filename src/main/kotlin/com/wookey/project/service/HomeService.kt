package com.wookey.project.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class HomeService(private val restTemplate: RestTemplate) {
    @Value("\${autocrypto.api.server}")
    private val apiServerUrl: String? = null

    val logger: Logger = LoggerFactory.getLogger(HomeService::class.java)

    fun getBalance(coin: String): String {
        var result:String = restTemplate.getForObject(apiServerUrl + "/coin/balance/${coin}", String::class)
        logger.info("result - {}", result)
        return result
    }
}