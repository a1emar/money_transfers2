fun main() {
    val typeCard = 3 // Vk Pay
    val totalMonthTransfer = 0 // коп
    val transferCash = 12000 // коп

    val transferFees = when (typeCard) {
        1 -> masterMaestro(transferCash, totalMonthTransfer)
        2 -> visaMir(transferCash, totalMonthTransfer)
        3 -> vkPay(transferCash, totalMonthTransfer)
        else -> println("Transfer ERROR")
    }
    if inLimit() {
        println("Обьем перевода: $transferCash коп")
        println("Комиссия: $transferFees коп")
    } else println("Превышен лимит перевода")
}

fun masterMaestro(transferCash: Int, totalMonthTransfer: Int) {

}

fun visaMir(transferCash: Int, totalMonthTransfer: Int) {

}

fun vkPay(transferCash: Int, totalMonthTransfer: Int) {

}

fun inLimit(function: () -> Unit) {

}