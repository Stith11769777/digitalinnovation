package one.digitalinnovation.collections

import java.sql.DriverManager.println

class Pessoa {
    var nome: String = "agatha"
    var cpf: String = "444.444.4444-44"
    private set

    constructor()

    fun pessoaInf() = "$nome + $cpf"
}

fun main() {
    val agatha = Pessoa()

    println(agatha.pessoaInf())

}
