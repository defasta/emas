package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentUntungRugi1Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UntungRugi1Fragment : BaseFragment<FragmentUntungRugi1Binding>(
    FragmentUntungRugi1Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi1FragmentDirections.actionUntungRugi1FragmentToUntungRugi2Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}