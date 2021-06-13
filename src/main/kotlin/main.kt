fun main() {
    println("Bem vindo ao Bytebank")

    val contaLeandro = Conta(titular= "Leandro", numero=1000)
    contaLeandro.deposita(200.0)

    val contaLuana = Conta( numero=1001, titular="Luana",)
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


class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    init {
        println("inicializando conta do $titular")
    }


//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun trasnfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.deposita(saldo)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//    fun setSaldo(valor: Double) {
//        this.saldo = valor
//    }
}

fun testaCopiaEreferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"

//    val contaMaria = contaJoao
    val contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"

    println("Conta joao ${contaJoao.titular}")
    println("Conta maria ${contaMaria.titular}")
}

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

fun testeCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> println("conta negativa")
    }
}