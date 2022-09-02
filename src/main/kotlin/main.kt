fun main() {
    val typeCard = 3 // Vk Pay
    val totalMonthTransfer = 0 // коп
    val transferCash = 12000 // коп

    val transferFees = fees(typeCard, totalMonthTransfer, transferCash)
    if (inLimit(typeCard, totalMonthTransfer, transferCash))
    println("Обьем перевода: $transferCash коп. Комиссия: $transferFees коп.")
    else println("Превышен лимит перевода")
}

fun fees(typeCard: Int, totalMonthTransfer: Int, transferCash: Int): Int {
    val transferFees: Int = when (typeCard) {
        1 -> masterMaestro(transferCash, totalMonthTransfer)
        2 -> visaMir(transferCash)
        else -> 0
    }
    return transferFees
}

fun masterMaestro(transferCash: Int, totalMonthTransfer: Int): Int {
    val res: Int = if (transferCash + totalMonthTransfer < 7500001) 0
        else (transferCash * 0.006 + 2000).toInt()
    return res
}

fun visaMir(transferCash: Int): Int {
    val res: Int = if (transferCash * 0.0075 < 3500) 3500
        else (transferCash * 0.0075).toInt()
    return res
}

fun inLimit(typeCard: Int, totalMonthTransfer: Int, transferCash: Int): Boolean {
    val res: Boolean = when (typeCard) {
        1, 2 -> if ((transferCash < 15000001)&&((transferCash + totalMonthTransfer) < 60000001)) true else false
        3 -> if ((transferCash < 1500001)&&((transferCash + totalMonthTransfer) < 4000001)) true else false
        else -> false
    }
    return res
}