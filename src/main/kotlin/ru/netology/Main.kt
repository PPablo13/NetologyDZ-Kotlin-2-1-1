package ru.netology

fun main() {
    val totalTax = taxCalc("Visa", 0, 10000)
    println("Комиссия составляет: $totalTax")
}

fun taxCalc(cardType: String, lastTransfers: Int, commonTransfer: Int): Int {
    val taxMCM =
        if ((lastTransfers + commonTransfer) > 75000) commonTransfer * 0.06 + 20 else 0 //комиссия по картам MasterCard & Maestro
    val taxVM = if ((commonTransfer * 0.0075) > 35) commonTransfer * 0.0075 else 35 //комиссия по картам Visa & Мир

    val tax = when (cardType) {
        "Master Card", "Maestro" -> taxMCM
        "Visa", "Мир" -> taxVM
        else -> 0
    }
    return tax.toInt()
}