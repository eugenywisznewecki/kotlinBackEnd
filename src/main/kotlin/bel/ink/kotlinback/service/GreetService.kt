package bel.ink.kotlinback.service

import org.springframework.stereotype.Component


@Component
class GreetService {


    interface Resp{
        class Success(val msg: String): Resp
        class Error(): Resp
    }

    fun greet(name: String): Resp{
            return if (name == "R") Resp.Error() else Resp.Success("hello ${name}")

    }
}