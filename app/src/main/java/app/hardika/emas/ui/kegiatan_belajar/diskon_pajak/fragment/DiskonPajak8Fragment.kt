package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak8Binding
import app.hardika.emas.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DiskonPajak8Fragment : BaseFragment<FragmentDiskonPajak8Binding>(
    FragmentDiskonPajak8Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.isVisible = false

        binding.k1n3.addTextChangedListener {
            if (binding.k2n4.text.toString().trim().isNotEmpty() && binding.k3n2.text.toString().trim().isNotEmpty() && it.toString().isNotEmpty()){
                binding.btnNext.isVisible = true
            }
        }

        binding.btnNext.setOnClickListener {
            val k1n3 = binding.k1n3.text.toString().trim()
            val k2n4 = binding.k2n4.text.toString().trim()
            val k3n2 = binding.k3n2.text.toString().trim()
            lifecycleScope.launch {
                viewModel.saveAnswerDp1Tabel1a(k1n3)
                viewModel.saveAnswerDp1Tabel1b(k2n4)
                viewModel.saveAnswerDp1Tabel1c(k3n2)
            }
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak8FragmentDirections.actionDiskonPajak8FragmentToDiskonPajak9Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            requireActivity().onBackPressed()
        }
    }
}