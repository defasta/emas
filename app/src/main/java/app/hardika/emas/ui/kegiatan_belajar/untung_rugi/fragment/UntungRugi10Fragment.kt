package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

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
import app.hardika.emas.databinding.FragmentUntungRugi10Binding
import app.hardika.emas.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class UntungRugi10Fragment : BaseFragment<FragmentUntungRugi10Binding>(
    FragmentUntungRugi10Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.isVisible = false

        binding.k2n3.addTextChangedListener {
            if (binding.k2n1.text.toString().trim().isNotEmpty() && binding.k5n1.text.toString().trim().isNotEmpty() && binding.k3n2.text.toString().trim().isNotEmpty() && binding.k5n1.text.toString().trim().isNotEmpty() && it.toString().isNotEmpty()){
                binding.btnNext.isVisible = true
            }
        }

        binding.btnNext.setOnClickListener {
            val k2n1 = binding.k2n1.text.toString().trim()
            val k2n3 = binding.k2n3.text.toString().trim()
            val k3n2 = binding.k3n2.text.toString().trim()
            val k5n1 = binding.k5n1.text.toString().trim()
            lifecycleScope.launch {
                viewModel.saveAnswerUr1Tabel1a(k2n1)
                viewModel.saveAnswerUr1Tabel1b(k2n3)
                viewModel.saveAnswerUr1Tabel1c(k3n2)
                viewModel.saveAnswerUr1Tabel1d(k5n1)
            }
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi10FragmentDirections.actionUntungRugi10FragmentToUntungRugi11Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            requireActivity().onBackPressed()
        }
    }
}