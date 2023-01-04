package com.fajar.dicodingprojectsimpleandroidapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fajar.dicodingprojectsimpleandroidapp.Adapter.UKMAdapter
import com.fajar.dicodingprojectsimpleandroidapp.Constant.ukm
import com.fajar.dicodingprojectsimpleandroidapp.DataModel.UKM
import com.fajar.dicodingprojectsimpleandroidapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var rv_Items:RecyclerView
    private lateinit var items:ArrayList<UKM>
    private lateinit var adapter:UKMAdapter


    private fun initComponents(){
        rv_Items = findViewById(R.id.rv_Items)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()

        loadData(1)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_beranda -> {
                loadData(1)
            }
            R.id.menu_favorite -> {
                loadData(2)
            }
            R.id.about_page -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun loadData(viewType:Int){
        when(viewType){
            // Beranda
            1 -> {
                supportActionBar?.title = getString(R.string.action_bar_text_main)
                items = ukm.getAllUkm()
                adapter = UKMAdapter(items)
                rv_Items.adapter = adapter
                rv_Items.layoutManager = LinearLayoutManager(this)
            }
            // List Favorit
            2 -> {
                supportActionBar?.title = getString(R.string.action_bar_text_favorite)
                items = ukm.getAllUkm().filter { it.favorite == 1 } as ArrayList<UKM>
                adapter = UKMAdapter(items)
                rv_Items.adapter = adapter
                rv_Items.layoutManager = LinearLayoutManager(this)
            }
        }

    }

    fun itemGetClicked(item:UKM){
        val intent = Intent(this, DetailActivity::class.java)
        intent.also {
            it.putExtra(DetailActivity.UKM, item)
            startActivity(it)
        }


    }
}



