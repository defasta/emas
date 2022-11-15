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
import app.hardika.emas.databinding.FragmentEvaluasiBelajar18Binding
import app.hardika.emas.startNewActivity
import app.hardika.emas.ui.MainViewModel
import app.hardika.emas.ui.NavigationActivity
import app.hardika.emas.ui.ShareActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class EvaluasiBelajar18Fragment : BaseFragment<FragmentEvaluasiBelajar18Binding>(
    FragmentEvaluasiBelajar18Binding:: inflate
) {
    val evaluasiBelajarNavController: NavController? by lazy { view?.findNavController() }
    private val viewModel by viewModels<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val appPreferences = AppPref(requireContext())
        binding.btnChooseA.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb18("A")
            }
            requireActivity().startNewActivity(ShareActivity::class.java)
        }

        binding.btnChooseB.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb18("B")
            }
            requireActivity().startNewActivity(ShareActivity::class.java)

        }

        binding.btnChooseC.setOnClickListener {
            lifecycleScope.launch {
                viewModel.saveAnswerEb18("C")
            }
            requireActivity().startNewActivity(ShareActivity::class.java)
        }

        binding.btnChooseD.setOnClickListener {
            appPreferences.pilganScore.asLiveData().observe(viewLifecycleOwner, Observer {
                if (it != null){
                    lifecycleScope.launch {
                        viewModel.savePilganScore(it + 1)
                        viewModel.saveAnswerEb18("D")
                    }
                }else{
                    lifecycleScope.launch {
                        viewModel.savePilganScore(1)
                        viewModel.saveAnswerEb18("D")
                    }
                }
            })
            requireActivity().startNewActivity(ShareActivity::class.java)
        }
//        binding.btnNext.setOnClickListener {
//            val direction =
//                app.hardika.emas.ui.evaluasi_belajar.fragment.EvaluasiBelajar18FragmentDirections.actionEvaluasiBelajar18FragmentToEvaluasiBelajar19Fragment()
//            evaluasiBelajarNavController?.navigate(direction)
//        }


    }
}