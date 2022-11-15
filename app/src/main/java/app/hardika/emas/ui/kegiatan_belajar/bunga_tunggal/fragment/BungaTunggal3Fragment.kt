package app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBungaTunggal3Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BungaTunggal3Fragment : BaseFragment<FragmentBungaTunggal3Binding>(
    FragmentBungaTunggal3Binding:: inflate
) {
    val bungaTunggalNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment.BungaTunggal3FragmentDirections.actionBungaTunggal3FragmentToBungaTunggal4Fragment()
            bungaTunggalNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}