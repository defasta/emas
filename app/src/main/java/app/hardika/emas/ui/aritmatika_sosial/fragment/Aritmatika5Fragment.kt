package app.hardika.emas.ui.aritmatika_sosial.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentAritmatika5Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Aritmatika5Fragment : BaseFragment<FragmentAritmatika5Binding>(
    FragmentAritmatika5Binding:: inflate
) {
    val aritmatikaNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.aritmatika_sosial.fragment.Aritmatika5FragmentDirections.actionAritmatika5FragmentToAritmatika6Fragment()
            aritmatikaNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}