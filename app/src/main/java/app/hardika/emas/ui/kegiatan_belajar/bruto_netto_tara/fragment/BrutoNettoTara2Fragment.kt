package app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBrutoNettoTara2Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BrutoNettoTara2Fragment : BaseFragment<FragmentBrutoNettoTara2Binding>(
    FragmentBrutoNettoTara2Binding:: inflate
) {
    val brutoNettoTaraNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.bruto_netto_tara.fragment.BrutoNettoTara2FragmentDirections.actionBrutoNettoTara2FragmentToBrutoNettoTara3Fragment()
            brutoNettoTaraNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}