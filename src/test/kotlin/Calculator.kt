import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Calculator {
    fun sum (a: Int, b: Int): Int {
        return a + b
    }
}

class CalculatorTest {
    @Test
    fun testSum(): Unit {
        val calculator = Calculator ()
        Assertions.assertThat( calculator.sum(2, 3)).isEqualTo(5)
    }
}