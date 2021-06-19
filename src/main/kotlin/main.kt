import main.kotlin.Diretor
import main.kotlin.Funcionario
import main.kotlin.Gerente

fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Leandro",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("\nnome ${fran.nome}")
    println("bonificação fran: ${fran.bonificacao()}")

    if(fran.autentica(1234)) {
        println("Autenticou com sucesso!");
    } else {
        println("Falha na autenticação!");
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 5000.0,
        senha = 4000,
        plr = 200.0
    )

    println("\nnome ${gui.nome}")
    println("bonificação gui: ${gui.bonificacao()}")
    println("plr: ${gui.bonificacao()}")

    if(gui.autentica(4000)) {
        println("Autenticou com sucesso!");
    } else {
        println("Falha na autenticação!");
    }
}
