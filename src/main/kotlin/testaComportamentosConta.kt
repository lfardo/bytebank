fun testaComportamentosConta() {
    val contaLeandro = Conta(titular = "Leandro", numero = 1000)
    contaLeandro.deposita(200.0)

    val contaLuana = Conta(numero = 1001, titular = "Luana")
    contaLuana.deposita(300.0)

    println(contaLeandro.titular)
    println(contaLeandro.numero)
    println(contaLeandro.saldo)

    println(contaLuana.titular)
    println(contaLuana.numero)
    println(contaLuana.saldo)

    println("Depositando na conta do Leandro")
    contaLeandro.deposita(50.0)
    println("${contaLeandro.saldo}")

    println("Depositando na conta da Luana")
    contaLuana.deposita(70.0)
    println("${contaLuana.saldo}")

    println("sacando da conta do leandro")
    contaLeandro.saca(250.0)
    println("${contaLeandro.saldo}")

    println("sacando da conta da luana")
    contaLuana.saca(25.0)
    println("${contaLuana.saldo}")

    println("sacando em excesso da conta do leandro")
    contaLeandro.saca(250.0)
    println("${contaLeandro.saldo}")

    println("Transferencia da conta do luana para leandro")
    if (contaLuana.trasnfere(10000.0, contaLeandro)) {
        println("transferencia sucedida")
    } else {
        println("transferencia não efetuada")
    }
    println("${contaLeandro.saldo}")
    println("${contaLuana.saldo}")
}