package bel.ink.kotlindemoback.restful


import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Component
@Path("greet/{name}")
open class GreetResourse {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun greet(@PathParam("name") name: String): Response {


        return Response.ok(name).build()


    }
}