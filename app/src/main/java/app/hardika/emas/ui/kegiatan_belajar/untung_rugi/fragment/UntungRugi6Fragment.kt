package app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentUntungRugi6Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UntungRugi6Fragment : BaseFragment<FragmentUntungRugi6Binding>(
    FragmentUntungRugi6Binding:: inflate
) {
    val untungRugiNavController: NavController? by lazy { view?.findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.untung_rugi.fragment.UntungRugi6FragmentDirections.actionUntungRugi6FragmentToUntungRugi7Fragment()
            untungRugiNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().stopService(Intent( context, BackgroundSoundService::class.java))
            requireActivity().onBackPressed()
        }
    }
}