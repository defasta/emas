package app.hardika.emas.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import app.hardika.emas.AppPref
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ClickSoundService
import app.hardika.emas.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        startService(Intent(this, BackgroundSoundService::class.java))


        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, NavigationActivity::class.java))
            startService(Intent(this, ClickSoundService::class.java))
        }

        binding.btnIu.setOnClickListener {
            startActivity(Intent(this, InformasiUmumActivity::class.java))
        }

        binding.btnPu.setOnClickListener {
            startActivity(Intent(this, PetunjukUmumActivity::class.java))
        }

    }
}