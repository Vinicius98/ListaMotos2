package alt.fib.br.listamotos

import java.io.Serializable

data class Moto(var id: Long,
                   var nome: String,
                   val marca: String? = null   ) : Serializable