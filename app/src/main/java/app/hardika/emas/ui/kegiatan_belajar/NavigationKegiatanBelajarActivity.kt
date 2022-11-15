package app.hardika.emas.ui.kegiatan_belajar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import app.hardika.emas.AppPref
import app.hardika.emas.databinding.ActivityNavigationKegiatanBelajarBinding
import app.hardika.emas.ui.NavigationActivity
import app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.BrutoNettoTaraActivity
import app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.BungaTunggalActivity
import app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.DiskonPajakActivity
import app.hardika.emas.ui.kegiatan_belajar.untung_rugi.UntungRugiActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NavigationKegiatanBelajarActivity : AppCompatActivity() {
    private lateinit var binding : ActivityNavigationKegiatanBelajarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationKegiatanBelajarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val appPreferences = AppPref(this)


        appPreferences.untungRugiStatus.asLiveData().observe(this, Observer { untungRugiStatus ->
            if(untungRugiStatus == true){
                binding.btnDkLock.isVisible = false
                binding.btnDk.isVisible = true
            }else if(untungRugiStatus == false){
                binding.btnDkLock.isVisible = true
                binding.btnDk.isVisible = false
            }
        })

        appPreferences.diskonPajakStatus.asLiveData().observe(this, Observer { diskonPajakStatus ->
            if(diskonPajakStatus == true){
                binding.btnBtLock.isVisible = false
                binding.btnBt.isVisible = true
            }else if (diskonPajakStatus == false){
                binding.btnBtLock.isVisible = true
                binding.btnBt.isVisible = false
            }
        })

        appPreferences.bungaTunggalStatus.asLiveData().observe(this, Observer { bungaTunggalStatus ->
            if(bungaTunggalStatus == true){
                binding.btnBntLock.isVisible = false
                binding.btnBnt.isVisible = true
            }else if(bungaTunggalStatus == false){
                binding.btnBntLock.isVisible = true
                binding.btnBnt.isVisible = false
            }
        })

        binding.btnUr.setOnClickListener {
            startActivity(Intent(this, UntungRugiActivity::class.java))
        }

        binding.btnDk.setOnClickListener {
            startActivity(Intent(this, DiskonPajakActivity::class.java))
        }

        binding.btnBt.setOnClickListener {
            startActivity(Intent(this, BungaTunggalActivity::class.java))
        }

        binding.btnBnt.setOnClickListener {
            startActivity(Intent(this, BrutoNettoTaraActivity::class.java))
        }

        binding.btnHome.setOnClickListener {
            startActivity(Intent(this, NavigationActivity::class.java))
            finishAffinity()
        }
    }
}