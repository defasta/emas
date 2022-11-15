package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak2Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiskonPajak2Fragment : BaseFragment<FragmentDiskonPajak2Binding>(
    FragmentDiskonPajak2Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.isVisible = false

        binding.k2n4.addTextChangedListener {
            if (binding.k1n3.text.toString().trim().isNotEmpty() && binding.k3n2.text.toString().trim().isNotEmpty() && it.toString().isNotEmpty()){
                binding.btnNext.isVisible = true
            }
        }
        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak2FragmentDirections.actionDiskonPajak2FragmentToDiskonPajak3Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}