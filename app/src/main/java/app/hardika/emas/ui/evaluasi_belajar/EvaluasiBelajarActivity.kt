package app.hardika.emas.ui.evaluasi_belajar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.databinding.ActivityEvaluasiBelajarBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EvaluasiBelajarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEvaluasiBelajarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEvaluasiBelajarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}