package alt.fib.br.listamotos

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_linha_customizada.*

import kotlinx.android.synthetic.main.activity_lista_moto.*

class ListaMoto : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_moto)

        setSupportActionBar(toolbar)
        val listaMoto = ArrayList<Moto>()
        val c1 = Moto(1L, "X300", "BMW")
        val c2 = Moto(2L, "T500", "BMW")

        listaMoto.add(c1)
        listaMoto.add(c2)

        val adapter = MotoAdapter(applicationContext,listaMoto, assets)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)


    }

}
