package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak5Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiskonPajak5Fragment : BaseFragment<FragmentDiskonPajak5Binding>(
    FragmentDiskonPajak5Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak5FragmentDirections.actionDiskonPajak5FragmentToDiskonPajak6Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            requireActivity().onBackPressed()
        }
    }
}