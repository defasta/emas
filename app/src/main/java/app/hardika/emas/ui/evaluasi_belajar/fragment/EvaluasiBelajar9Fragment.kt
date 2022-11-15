package app.hardika.emas.ui.evaluasi_belajar.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.AppPref
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentEvaluasiBelajar9Binding
import app.hardika.emas.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class EvaluasiBelajar9Fragment : BaseFragment<FragmentEvaluasiBelajar9Binding>(
    FragmentEvaluasiBelajar9Binding:: inflate
) {
    val evaluasiBelajarNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val appPreferences = AppPref(requireContext())
        binding.btnChooseA.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb9("A")
            }
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar9FragmentDirections.actionEvaluasiBelajar9FragmentToEvaluasiBelajar10Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

        binding.btnChooseB.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb9("B")
            }
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar9FragmentDirections.actionEvaluasiBelajar9FragmentToEvaluasiBelajar10Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

        binding.btnChooseC.setOnClickListener {
            appPreferences.pilganScore.asLiveData().observe(viewLifecycleOwner, Observer {
                if (it != null){
                    lifecycleScope.launch {
                        viewModel.savePilganScore(it + 1)
                        lifecycleScope.launch {
                            viewModel.saveAnswerEb9("C")
                        }
                    }
                }else{
                    lifecycleScope.launch {
                        viewModel.savePilganScore(1)
                        viewModel.saveAnswerEb9("C")
                    }
                }
            })
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar9FragmentDirections.actionEvaluasiBelajar9FragmentToEvaluasiBelajar10Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

        binding.btnChooseD.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb9("D")
            }
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar9FragmentDirections.actionEvaluasiBelajar9FragmentToEvaluasiBelajar10Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

    }
}