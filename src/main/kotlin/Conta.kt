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