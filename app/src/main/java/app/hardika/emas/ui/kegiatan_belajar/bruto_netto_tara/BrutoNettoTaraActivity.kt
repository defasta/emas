package app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.R
import app.hardika.emas.databinding.ActivityBrutoNettoTaraBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BrutoNettoTaraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrutoNettoTaraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrutoNettoTaraBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}