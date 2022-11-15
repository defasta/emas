package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak1Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiskonPajak1Fragment : BaseFragment<FragmentDiskonPajak1Binding>(
    FragmentDiskonPajak1Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak1FragmentDirections.actionDiskonPajak1FragmentToDiskonPajak2Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}