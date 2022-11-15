package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentUntungRugi4Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UntungRugi4Fragment : BaseFragment<FragmentUntungRugi4Binding>(
    FragmentUntungRugi4Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }
    private lateinit var webView: WebView
    val backgroundSoundService = BackgroundSoundService()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            //backgroundSoundService.onPause()
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi4FragmentDirections.actionUntungRugi4FragmentToUntungRugi5Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }

    }
}