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
import app.hardika.emas.databinding.FragmentEvaluasiBelajar10Binding
import app.hardika.emas.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class EvaluasiBelajar10Fragment : BaseFragment<FragmentEvaluasiBelajar10Binding>(
    FragmentEvaluasiBelajar10Binding:: inflate
) {
    val evaluasiBelajarNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val appPreferences = AppPref(requireContext())
        binding.btnChooseA.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb10("A")
            }
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar10FragmentDirections.actionEvaluasiBelajar10FragmentToEvaluasiBelajar11Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

        binding.btnChooseB.setOnClickListener {
            appPreferences.pilganScore.asLiveData().observe(viewLifecycleOwner, Observer {
                if (it != null){
                    lifecycleScope.launch {
                        viewModel.savePilganScore(it + 1)
                        viewModel.saveAnswerEb10("B")
                    }
                }else{
                    lifecycleScope.launch {
                        viewModel.savePilganScore(1)
                        viewModel.saveAnswerEb10("B")
                    }
                }
            })
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar10FragmentDirections.actionEvaluasiBelajar10FragmentToEvaluasiBelajar11Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

        binding.btnChooseC.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb10("C")
            }
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar10FragmentDirections.actionEvaluasiBelajar10FragmentToEvaluasiBelajar11Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

        binding.btnChooseD.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb10("D")
            }
            val direction =
                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar10FragmentDirections.actionEvaluasiBelajar10FragmentToEvaluasiBelajar11Fragment()
            evaluasiBelajarNavController?.navigate(direction)
        }

    }
}