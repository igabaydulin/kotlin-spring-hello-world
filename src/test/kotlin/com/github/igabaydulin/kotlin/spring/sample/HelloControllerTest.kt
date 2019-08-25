package com.github.igabaydulin.kotlin.spring.sample

import org.hamcrest.Matchers
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@DisplayName("Test HelloController API")
@ExtendWith(SpringExtension::class)
@WebMvcTest(HelloController::class)
class HelloControllerTest {

    @Autowired lateinit var mockMvc: MockMvc

    // TODO: Spring 5.2.0.RC1 introduces MockMvcExtensions.kt
    @Test
    @DisplayName("Test GET /hello endpoint")
    fun testHelloEndpoint() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(MockMvcResultMatchers.jsonPath("$.to", Matchers.`is`("World")))
            .andExpect(MockMvcResultMatchers.jsonPath("$.greeting", Matchers.`is`("Hello, World!")))
    }
}
