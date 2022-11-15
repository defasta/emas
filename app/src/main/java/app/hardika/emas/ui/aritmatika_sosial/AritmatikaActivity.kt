package app.hardika.emas.ui.aritmatika_sosial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.R
import app.hardika.emas.databinding.ActivityAritmatikaBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AritmatikaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAritmatikaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAritmatikaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}