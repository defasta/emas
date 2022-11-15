package app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBungaTunggal6Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BungaTunggal6Fragment : BaseFragment<FragmentBungaTunggal6Binding>(
    FragmentBungaTunggal6Binding:: inflate
) {
    val bungaTunggalNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment.BungaTunggal6FragmentDirections.actionBungaTunggal6FragmentToBungaTunggal7Fragment()
            bungaTunggalNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}