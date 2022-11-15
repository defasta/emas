package app.hardika.emas.ui.kegiatan_belajar.untung_rugi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.R
import app.hardika.emas.databinding.ActivityUntungRugiBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UntungRugiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUntungRugiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUntungRugiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}