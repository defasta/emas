package app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBungaTunggal5Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BungaTunggal5Fragment : BaseFragment<FragmentBungaTunggal5Binding>(
    FragmentBungaTunggal5Binding:: inflate
) {
    val bungaTunggalNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment.BungaTunggal5FragmentDirections.actionBungaTunggal5FragmentToBungaTunggal6Fragment()
            bungaTunggalNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}