package ru.netology

import org.junit.Test
import kotlin.test.assertEquals

class MainKtTest {

    @Test
    fun taxCalcIfVisa() {

        val cardType = "Visa"
        val lastTransfers = 0
        val commonTransfer = 10000

        val totalTax = taxCalc(cardType, lastTransfers, commonTransfer)

        assertEquals(expected = 75, actual = totalTax)
    }

    @Test
    fun taxCalcIfMC() {

        val cardType = "Master Card"
        val lastTransfers = 1000
        val commonTransfer = 80000

        val totalTax = taxCalc(cardType, lastTransfers, commonTransfer)

        assertEquals(expected = 4820, actual = totalTax)
    }

    @Test
    fun taxCalcIfVK() {

        val cardType = "VK PAY"
        val lastTransfers = 4000
        val commonTransfer = 15000

        val totalTax = taxCalc(cardType, lastTransfers, commonTransfer)

        assertEquals(expected = 0, actual = totalTax)
    }

    @Test
    fun taxCalcIfMirMinTax() {

        val cardType = "Мир"
        val lastTransfers = 4000
        val commonTransfer = 100

        val totalTax = taxCalc(cardType, lastTransfers, commonTransfer)

        assertEquals(expected = 0, actual = totalTax)
    }
}
