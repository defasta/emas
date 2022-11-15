package app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBrutoNettoTara3Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BrutoNettoTara3Fragment : BaseFragment<FragmentBrutoNettoTara3Binding>(
    FragmentBrutoNettoTara3Binding:: inflate
) {
    val brutoNettoTaraNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.fragment.BrutoNettoTara3FragmentDirections.actionBrutoNettoTara3FragmentToBrutoNettoTara4Fragment()
            brutoNettoTaraNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}