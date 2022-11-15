package app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBrutoNettoTara5Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BrutoNettoTara5Fragment : BaseFragment<FragmentBrutoNettoTara5Binding>(
    FragmentBrutoNettoTara5Binding:: inflate
) {
    val brutoNettoTaraNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.fragment.BrutoNettoTara5FragmentDirections.actionBrutoNettoTara5FragmentToBrutoNettoTara6Fragment()
            brutoNettoTaraNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            requireActivity().onBackPressed()
        }
    }
}