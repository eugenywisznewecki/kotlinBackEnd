package bel.ink.kotlindemoback

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

open class ServletInitializer : SpringBootServletInitializer() {

	override fun configure(application: SpringApplicationBuilder) : SpringApplicationBuilder {
		return application.sources(KotlindemobackApplication::class.java)
	}

}
