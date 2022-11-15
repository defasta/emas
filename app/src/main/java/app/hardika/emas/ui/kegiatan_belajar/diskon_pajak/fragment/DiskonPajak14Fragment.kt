package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak14Binding
import app.hardika.emas.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DiskonPajak14Fragment : BaseFragment<FragmentDiskonPajak14Binding>(
    FragmentDiskonPajak14Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }
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
                viewModel.saveAnswerDpP3(answer)
            }
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak14FragmentDirections.actionDiskonPajak14FragmentToDiskonPajak15Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}