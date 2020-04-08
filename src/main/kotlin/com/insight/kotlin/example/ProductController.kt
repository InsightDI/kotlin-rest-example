package com.insight.kotlin.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.ThreadLocalRandom

@RestController
@RequestMapping("product")
class ProductController {

    @GetMapping
    fun getProduct() = Product("Some Product", ThreadLocalRandom.current().nextInt())
}