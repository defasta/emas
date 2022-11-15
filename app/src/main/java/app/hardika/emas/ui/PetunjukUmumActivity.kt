package app.hardika.emas.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.hardika.emas.databinding.ActivityPetunjukUmumBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PetunjukUmumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPetunjukUmumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPetunjukUmumBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        binding.btnHome.setOnClickListener {
            onBackPressed()
        }
    }
}