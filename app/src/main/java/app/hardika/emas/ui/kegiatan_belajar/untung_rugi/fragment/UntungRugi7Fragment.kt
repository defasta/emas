package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentUntungRugi7Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UntungRugi7Fragment : BaseFragment<FragmentUntungRugi7Binding>(
    FragmentUntungRugi7Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi7FragmentDirections.actionUntungRugi7FragmentToUntungRugi8Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}