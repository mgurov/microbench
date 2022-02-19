package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    org.openjdk.jmh.Main.main(args)
	//runApplication<DemoApplication>(*args)
}
