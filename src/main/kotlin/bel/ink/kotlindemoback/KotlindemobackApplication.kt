package bel.ink.kotlindemoback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlindemobackApplication: ServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return  application.sources(KotlindemobackApplication::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<KotlindemobackApplication>(*args)
}
