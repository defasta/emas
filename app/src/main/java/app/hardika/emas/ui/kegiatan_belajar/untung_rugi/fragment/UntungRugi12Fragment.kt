package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentUntungRugi12Binding
import app.hardika.emas.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class UntungRugi12Fragment : BaseFragment<FragmentUntungRugi12Binding>(
    FragmentUntungRugi12Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.isVisible = false

        binding.etJawab.addTextChangedListener {
            if (it.toString().isNotEmpty()){
                binding.btnNext.isVisible = true
            }
        }

        binding.btnNext.setOnClickListener {
            val answer = binding.etJawab.text.toString().trim()
            lifecycleScope.launch {
                viewModel.saveAnswerUr3(answer)
            }
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi12FragmentDirections.actionUntungRugi12FragmentToUntungRugi13Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}