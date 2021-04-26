package one.digitalinnovation.collections

import one.digitalinnovation.collections.banco.Banco
import java.sql.DriverManager.println

fun main(){
    val DigOneBank = Banco(nome = "DigiOne", numero = 12 )
    println(DigOneBank.nome)
    println(DigOneBank.numero)

    val Banco2 = DigOneBank.copy(nome = "Banco2")
    println(Banco2.Inte())
}