package app.hardika.emas.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.databinding.ActivityInformasiUmumBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InformasiUmumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformasiUmumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityInformasiUmumBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        binding.btnHome.setOnClickListener {
            onBackPressed()
        }
    }
}