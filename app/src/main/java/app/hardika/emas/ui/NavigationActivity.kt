package app.hardika.emas.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import app.hardika.emas.AppPref
import app.hardika.emas.ui.aritmatika_sosial.AritmatikaActivity
import app.hardika.emas.databinding.ActivityNavigationBinding
import app.hardika.emas.ui.evaluasi_belajar.EvaluasiBelajarActivity
import app.hardika.emas.ui.kegiatan_belajar.NavigationKegiatanBelajarActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NavigationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNavigationBinding
    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val appPreferences = AppPref(this)

        lifecycleScope.launch {
            viewModel.savePilganScore(0)
        }

        appPreferences.aritmatikaStatus.asLiveData().observe(this, Observer { isAritmatikaDone ->
            if(isAritmatikaDone == true ){
                binding.btnKbLock.isVisible = false
                binding.btnKb.isVisible = true
            }else if(isAritmatikaDone == false){
                binding.btnKbLock.isVisible = true
                binding.btnKb.isVisible = false
            }
        })

        appPreferences.kegiatanBelajarStatus.asLiveData().observe(this, Observer { isKegiatanBelajarDone ->
            if(isKegiatanBelajarDone == true ){
                binding.btnEbLock.isVisible = false
                binding.btnEb.isVisible = true
            }else if (isKegiatanBelajarDone == false){
                binding.btnEbLock.isVisible = true
                binding.btnEb.isVisible = false
            }
        })

        binding.btnAs.setOnClickListener {
            startActivity(Intent(this, AritmatikaActivity::class.java))
        }

        binding.btnKb.setOnClickListener {
            startActivity(Intent(this, NavigationKegiatanBelajarActivity::class.java))
        }

        binding.btnHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finishAffinity()
        }

        binding.btnEb.setOnClickListener {
            startActivity(Intent(this, EvaluasiBelajarActivity::class.java))
        }


    }
}