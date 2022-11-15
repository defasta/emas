package app.hardika.emas.ui.aritmatika_sosial.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentAritmatika9Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Aritmatika9Fragment : BaseFragment<FragmentAritmatika9Binding>(
    FragmentAritmatika9Binding:: inflate
) {
    val aritmatikaNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.aritmatika_sosial.fragment.Aritmatika9FragmentDirections.actionAritmatika9FragmentToAritmatika10Fragment()
            aritmatikaNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}