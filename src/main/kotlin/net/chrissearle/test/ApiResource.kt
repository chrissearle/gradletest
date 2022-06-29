package net.chrissearle.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class ApiResource {
    @GetMapping
    @ResponseBody
    fun getAll() = listOf(
        "id" to 1, "id" to 2, "id" to 3, "id" to 4
    )
}