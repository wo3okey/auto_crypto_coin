package com.wookey.project.common

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class ApiService<T>(private val restTemplate: RestTemplate) {
    fun get(url: String, httpHeaders: HttpHeaders): ResponseEntity<T> {
        return callApiEndpoint(url, HttpMethod.GET, httpHeaders, null, Any::class.java as Class<T>)
    }

    fun get(url: String, httpHeaders: HttpHeaders, clazz: Class<T>): ResponseEntity<T> {
        return callApiEndpoint(url, HttpMethod.GET, httpHeaders, null, clazz)
    }

    fun post(url: String, httpHeaders: HttpHeaders, body: Any?): ResponseEntity<T> {
        return callApiEndpoint(url, HttpMethod.POST, httpHeaders, body, Any::class.java as Class<T>)
    }

    fun post(url: String, httpHeaders: HttpHeaders, body: Any?, clazz: Class<T>): ResponseEntity<T> {
        return callApiEndpoint(url, HttpMethod.POST, httpHeaders, body, clazz)
    }

    private fun callApiEndpoint(
        url: String,
        httpMethod: HttpMethod,
        httpHeaders: HttpHeaders,
        body: Any?,
        clazz: Class<T>
    ): ResponseEntity<T> {
        return restTemplate.exchange(url, httpMethod, HttpEntity(body, httpHeaders), clazz)
    }
}