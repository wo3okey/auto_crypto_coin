package com.wookey.project.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.redis.core.ListOperations
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.ValueOperations
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject


@Service
class HomeService @Autowired constructor(
    val restTemplate: RestTemplate,
    val redisTemplate: RedisTemplate<String, Any>
) {
    @Value("\${autocrypto.api.server}")
    private val apiServerUrl: String? = null

    val logger: Logger = LoggerFactory.getLogger(HomeService::class.java)
    val valueOperations: ValueOperations<String, Any> = redisTemplate.opsForValue()
    val listOperations: ListOperations<String, Any> = redisTemplate.opsForList()

    fun getBalance(coin: String): String {
        return restTemplate.getForObject<String>(apiServerUrl + "/coin/balance/${coin}", String::class).toString()
    }

    fun getProfit(coin: String): String {
        val key = "coin.$coin"
        return valueOperations.get(key).toString()
    }
}