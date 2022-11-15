package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentUntungRugi2Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UntungRugi2Fragment : BaseFragment<FragmentUntungRugi2Binding>(
    FragmentUntungRugi2Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.isVisible = false

        binding.k5n4.addTextChangedListener {
            if (binding.k4n3.text.toString().trim().isNotEmpty() && binding.k4n4.text.toString().trim().isNotEmpty() &&  binding.k5n3.text.toString().trim().isNotEmpty() && it.toString().isNotEmpty() ){
                binding.btnNext.isVisible = true
            }
        }
        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi2FragmentDirections.actionUntungRugi2FragmentToUntungRugi3Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}