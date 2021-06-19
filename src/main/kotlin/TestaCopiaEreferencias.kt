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
