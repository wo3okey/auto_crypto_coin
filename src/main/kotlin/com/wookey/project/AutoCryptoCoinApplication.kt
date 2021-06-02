package com.wookey.project

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

// War
@SpringBootApplication
class AutoCryptoCoinApplication: SpringBootServletInitializer()

// War packaging
@Override
fun configure(applicationBuilder: SpringApplicationBuilder): SpringApplicationBuilder {
    return applicationBuilder.sources(SpringBootServletInitializer::class.java)
}

fun main(args: Array<String>) {
    runApplication<AutoCryptoCoinApplication>(*args)
}

