package app.hardika.emas.ui.kegiatan_belajar.bunga_tunggal.fragment

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentBungaTunggal12Binding
import app.hardika.emas.startNewActivity
import app.hardika.emas.ui.MainViewModel
import app.hardika.emas.ui.kegiatan_belajar.NavigationKegiatanBelajarActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BungaTunggal12Fragment : BaseFragment<FragmentBungaTunggal12Binding>(
    FragmentBungaTunggal12Binding:: inflate
) {
    val bungaTunggalNavController: NavController? by lazy { view?.findNavController() }
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
                viewModel.saveAnswerBtP5(answer)
            }
            lifecycleScope.launch {
                viewModel.saveBungaTuggalStatus(true)
            }
            requireActivity().startNewActivity(NavigationKegiatanBelajarActivity::class.java)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}