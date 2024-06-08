package org.example

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


object NetworkDriver {
    init {
        println("Initializing NetworkDriver")
    }

    fun log(): NetworkDriver = apply {
        println("Initializing NetworkDriver: $this")
    }

}
class SingletonTest {
    @Test
    fun test() {
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()
        Assertions.assertThat(networkDriver1).isSameAs(networkDriver2)
    }
}