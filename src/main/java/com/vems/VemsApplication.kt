package com.vems

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object VemsApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(VemsApplication::class.java, *args)
    }

}
