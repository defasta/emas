package app.hardika.emas.ui.aritmatika_sosial.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentAritmatika4Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Aritmatika4Fragment : BaseFragment<FragmentAritmatika4Binding>(
    FragmentAritmatika4Binding:: inflate
) {
    val aritmatikaNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.aritmatika_sosial.fragment.Aritmatika4FragmentDirections.actionAritmatika4FragmentToAritmatika5Fragment()
            aritmatikaNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}