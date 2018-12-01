package alt.fib.br.listamotos

import android.content.Context
import android.content.res.AssetManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.io.IOException
import java.io.InputStream

class MotoAdapter(context: Context, lista: ArrayList<Moto>, assetManager: AssetManager) : BaseAdapter() {
    private var listaMoto: ArrayList<Moto>
    private var inflator: LayoutInflater
    private var assetManager: AssetManager
    init {
        this.inflator = LayoutInflater.from(context)
        this.listaMoto = lista
        this.assetManager = assetManager
    }
    override fun getCount(): Int {
        return this.listaMoto.size
    }

    override fun getItem(position: Int): Any? {
        return this.listaMoto.get(position)
    }

    override fun getItemId(position: Int): Long {
        return this.listaMoto.get(position).id;
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View? {

        val moto = this.listaMoto.get(position)
        val view = this.inflator.inflate(R.layout.motolinha, parent, false)
        val bitmapImage = this.getBitmapFromAsset(moto.id)
        (view.findViewById<TextView>(R.id.nome)).text = moto.nome
        var imageView = view.findViewById<ImageView>(R.id.foto)
        imageView.setImageBitmap(bitmapImage)

        return view
    }
    private fun getBitmapFromAsset(id: Long): Bitmap {
        val assetManager = this.assetManager
        var istr: InputStream? = null
        try {
            istr = assetManager.open("$id.png")
        } catch (e: IOException) {
            istr = assetManager.open("$id.jpg")
        }
        return BitmapFactory.decodeStream(istr)
    }


}