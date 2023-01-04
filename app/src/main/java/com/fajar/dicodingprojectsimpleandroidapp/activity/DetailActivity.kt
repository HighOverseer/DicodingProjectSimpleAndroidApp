package com.fajar.dicodingprojectsimpleandroidapp.activity


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toBitmap
import com.bumptech.glide.Glide
import com.fajar.dicodingprojectsimpleandroidapp.DataModel.UKM
import com.fajar.dicodingprojectsimpleandroidapp.R

class DetailActivity : AppCompatActivity() {
    companion object{
        const val UKM = "ukm"
    }

    private lateinit var iv_logoDetail:ImageView
    private lateinit var tv_deskripsiDetail:TextView
    private lateinit var tv_visi:TextView
    private lateinit var tv_misi:TextView

    private fun initComponents(){
        iv_logoDetail = findViewById(R.id.iv_logoDetail)
        tv_deskripsiDetail = findViewById(R.id.tv_deskripsiDetail)
        tv_visi = findViewById(R.id.tv_visi)
        tv_misi = findViewById(R.id.tv_misi)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initComponents()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        getItem()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
            R.id.action_share -> {
                val intent = Intent()
                intent.apply {
                    setAction(Intent.ACTION_SEND)
                    putExtra(Intent.EXTRA_TEXT, "${supportActionBar?.title}\n\n" +
                            "${tv_deskripsiDetail.text}\n\n" +
                            "Visi :\n${tv_visi.text}\n\n" +
                            "Misi :\n${tv_misi.text}")
                    setType("text/plain")
                }
                val shareIntent = Intent.createChooser(intent, null)
                startActivity(shareIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getItem(){
        val item = intent.getParcelableExtra<UKM>(DetailActivity.UKM)

        //safe cast
        if(item is UKM){
            val (logo, nama, deskripsi, visi, misi) = item
            supportActionBar?.title = nama

            Glide.with(this@DetailActivity)
                .load(logo)
                .into(iv_logoDetail)
            tv_deskripsiDetail.text = deskripsi
            tv_visi.text = addQuotationMark(visi, tv_visi)
            tv_misi.text = addQuotationMark(misi, tv_misi)

        }
    }

    private fun addQuotationMark(text:String, textView: TextView):String{
        return if(text[0].toString() != "1"){
            textView.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            val stringBuilder = StringBuilder()
            return stringBuilder.run {
                append("\"")
                append(text)
                append("\"")
                toString()
            }
        }else{
            text
        }


    }

}