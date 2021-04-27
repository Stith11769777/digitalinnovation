package one.digitalinnovation.collections.banco

import one.digitalinnovation.collections.ClienteTipo
import java.sql.DriverManager.println

fun main(){
    ClienteTipo.values().iterator(
     println ("${It.name}+${iT.descricao}")
    }
    val PF = ClienteTipo.PF
    println ("${PF.name}+${PF.descricao}")

    val PJ = ClienteTipo.PJ
    println ("${PJ.name}+${PJ.descricao}")
}