package main.kotlin

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {

//    fun bonificacao(): Double {
//        return salario * 0.2
//    }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}