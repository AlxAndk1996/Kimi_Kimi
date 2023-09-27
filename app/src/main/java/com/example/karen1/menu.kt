package com.example.karen1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.PopupMenu
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class menu : AppCompatActivity() {

    private lateinit var menuu: ImageView
    private lateinit var serchView: SearchView
    private lateinit var recyclerView: RecyclerView
    //private lateinit var adapter: CustomAdapter
    private lateinit var menu22: BottomNavigationView

    class Productos {
        var nombre: String = ""
        var descripcion: String= ""
        var imagenp_id: Int = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menupp: LinearLayout= findViewById(R.id.menu_compra)
        //val listaProductos: List<lista_productos> = obtenerListaDeProductos()

        //for (producto in lista)


        menu22 =findViewById(R.id.menu2)
        menu22.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.inicio -> {
                    true
                }
                R.id.compras -> {
                    true
                }
                R.id.actividades -> {
                    true
                }
                R.id.perfil -> {
                    true
                }
                else -> false
            }
        }

        menuu =findViewById(R.id.imageView4)
    }
    fun showPopupMenu(view: View){
        val menuuu = PopupMenu(this, view)
        menuuu.menuInflater.inflate(R.menu.popup_menu, menuuu.menu)

        menuuu.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.option1 -> {
                    //opcion 1
                    true
                }
                R.id.option2 -> {
                    //opcion 2
                    true
                }
                R.id.option3 -> {
                    //opcion 3
                    true
                }
                R.id.option4 -> {
                    true
                }
                R.id.option5 -> {
                    true
                }
                R.id.option6 -> {
                    true
                }
                else -> false
            }
        }
        menuuu.show()
    }

}