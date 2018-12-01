package alt.fib.br.listamotos

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class DetalheMoto : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalhemoto)

        val intent = intent
        if (intent != null) {
          val moto = intent.getSerializableExtra("moto") as Moto
          val nomecontato = findViewById<TextView>(R.id.nomecontato)
            //nomecontato.text = Moto.nome
        }

    }
}
