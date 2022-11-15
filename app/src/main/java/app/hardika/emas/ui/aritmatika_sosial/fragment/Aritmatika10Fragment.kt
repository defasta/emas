package app.hardika.emas.ui.aritmatika_sosial.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.AppPref
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentAritmatika10Binding
import app.hardika.emas.startNewActivity
import app.hardika.emas.ui.MainViewModel
import app.hardika.emas.ui.NavigationActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class Aritmatika10Fragment : BaseFragment<FragmentAritmatika10Binding>(
    FragmentAritmatika10Binding:: inflate
) {
    val aritmatikaNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAritmatikaStatus(true)
            }
            requireActivity().startNewActivity(NavigationActivity::class.java)
        }
        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}