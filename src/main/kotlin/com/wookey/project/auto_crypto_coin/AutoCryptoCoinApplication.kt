package com.wookey.project.auto_crypto_coin

import com.samskivert.mustache.Mustache
import com.samskivert.mustache.Mustache.TemplateLoader
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.env.Environment


@SpringBootApplication
class AutoCryptoCoinApplication

fun main(args: Array<String>) {
    runApplication<AutoCryptoCoinApplication>(*args)
}

@Bean
fun mustacheCompiler(
    mustacheTemplateLoader: TemplateLoader?,
    environment: Environment
): Mustache.Compiler? {
    val collector = MustacheEnvironmentCollector()
    collector.setEnvironment(environment)

    // default value
    return Mustache.compiler().defaultValue("")
        .withLoader(mustacheTemplateLoader)
        .withCollector(collector)
}

