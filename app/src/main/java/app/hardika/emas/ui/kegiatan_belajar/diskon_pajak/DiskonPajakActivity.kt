package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.databinding.ActivityDiskonPajakBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiskonPajakActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDiskonPajakBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiskonPajakBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}