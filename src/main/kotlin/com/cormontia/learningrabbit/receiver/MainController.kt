package com.cormontia.learningrabbit.receiver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping("/receive")
    fun receive(): String {
        return "Stub for the /receive page."
    }
}