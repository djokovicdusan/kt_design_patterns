package org.example

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

sealed class Country {
    object Canada : Country()
}

object Spain : Country()
class Greece(val property: String) : Country()
data class USA(val property: String) : Country()
class Poland : Country()

class Currency(val currency: String) {

}
//Singleton

object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency = when (country) {
        is USA -> Currency("USD");
        is Country.Canada -> Currency("cad");
        is Greece -> Currency("EURO");
        is Spain -> Currency("EURO")
        is Poland -> Currency("zlot");
    }
}

class FactoryTest {
    @Test
    fun currencyTest() {
        val greekCurrency: String = CurrencyFactory.currencyForCountry(Greece("")).currency
        val usaCurrency: String = CurrencyFactory.currencyForCountry(USA("")).currency

        Assertions.assertThat(greekCurrency).isEqualTo("EURO")
        Assertions.assertThat(usaCurrency).isEqualTo("USD")
    }
}