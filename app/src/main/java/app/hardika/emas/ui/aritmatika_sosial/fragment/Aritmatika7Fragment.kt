package app.hardika.emas.ui.aritmatika_sosial.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentAritmatika7Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Aritmatika7Fragment : BaseFragment<FragmentAritmatika7Binding>(
    FragmentAritmatika7Binding:: inflate
) {
    val aritmatikaNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.aritmatika_sosial.fragment.Aritmatika7FragmentDirections.actionAritmatika7FragmentToAritmatika8Fragment()
            aritmatikaNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}