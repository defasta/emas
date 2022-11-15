package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak6Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiskonPajak6Fragment : BaseFragment<FragmentDiskonPajak6Binding>(
    FragmentDiskonPajak6Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak6FragmentDirections.actionDiskonPajak6FragmentToDiskonPajak7Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}