package app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.R
import app.hardika.emas.databinding.ActivityBungaTunggalBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BungaTunggalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBungaTunggalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBungaTunggalBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}