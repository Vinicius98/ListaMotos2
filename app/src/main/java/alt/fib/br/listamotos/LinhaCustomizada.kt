package alt.fib.br.listamotos

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_linha_customizada.*

class LinhaCustomizada : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linha_customizada)
        setSupportActionBar(toolbar)
        val listaMoto = ArrayList<Moto>()
        val c1 = Moto(1L, "Collor", "color@br.com")
        val c2 = Moto(2L, "Dilma", "dilma@br.com")

        listaMoto.add(c1)
        listaMoto.add(c2)

        val adapter = MotoAdapter(applicationContext,listaMoto, assets)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)


    }

}
