fun testaLacos() {
    for (i in 5 downTo 1 step 2) {
        val titular = "Leandro $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("Número da conta $numeroConta")
        println("saldo $saldo")
        println()
    }

    var i = 0
    while (i < 5) {
        val titular = "Leandro $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("Número da conta $numeroConta")
        println("saldo $saldo")
        println()
        i++
    }
}