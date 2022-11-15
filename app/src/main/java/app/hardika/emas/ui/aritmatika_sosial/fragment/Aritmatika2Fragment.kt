package app.hardika.emas.ui.aritmatika_sosial.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentAritmatika2Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Aritmatika2Fragment : BaseFragment<FragmentAritmatika2Binding>(
    FragmentAritmatika2Binding:: inflate
) {
    val aritmatikaNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.aritmatika_sosial.fragment.Aritmatika2FragmentDirections.actionAritmatika2FragmentToAritmatika3Fragment()
            aritmatikaNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}