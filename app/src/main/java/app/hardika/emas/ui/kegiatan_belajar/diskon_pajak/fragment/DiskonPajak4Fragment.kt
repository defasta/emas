package app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.MediaController
import androidx.navigation.NavController
import androidx.navigation.findNavController
import app.hardika.emas.BackgroundSoundService
import app.hardika.emas.ui.BaseFragment
import app.hardika.emas.databinding.FragmentDiskonPajak4Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiskonPajak4Fragment : BaseFragment<FragmentDiskonPajak4Binding>(
    FragmentDiskonPajak4Binding:: inflate
) {
    val diskonPajakNavController: NavController? by lazy { view?.findNavController() }
    private lateinit var webView: WebView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            requireActivity().startService(Intent( context, BackgroundSoundService::class.java))
            val direction =
                app.hardika.emas.ui.kegiatan_belajar.diskon_pajak.fragment.DiskonPajak4FragmentDirections.actionDiskonPajak4FragmentToDiskonPajak5Fragment()
            diskonPajakNavController?.navigate(direction)
        }

        binding.btnBack.setOnClickListener {
            requireActivity().startService(Intent( context, BackgroundSoundService::class.java))
            requireActivity().onBackPressed()
        }

        webView = binding.webviewPlayerView
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = CustomChromeClient() // Full-screen support
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.allowFileAccess = true
        if (savedInstanceState == null) {
            webView.loadUrl("https://www.youtube.com/embed/IFMEsi3J4h0")
        }
    }

    private inner class CustomChromeClient : WebChromeClient() {
        private var mCustomView: View? = null
        private var mCustomViewCallback: CustomViewCallback? = null
        private var mOriginalOrientation = 0
        private var requestedOrientation = 0
        private var mOriginalSystemUiVisibility = 0
        override fun getDefaultVideoPoster(): Bitmap? {
            return if (mCustomView == null) {
                null
            } else BitmapFactory.decodeResource(requireActivity().applicationContext.resources, 2130837573)
        }

        override fun onHideCustomView() {
            (requireActivity().window.decorView as FrameLayout).removeView(mCustomView)
            mCustomView = null
            requireActivity().window.decorView.systemUiVisibility = mOriginalSystemUiVisibility
            requestedOrientation = mOriginalOrientation
            mCustomViewCallback!!.onCustomViewHidden()
            mCustomViewCallback = null
        }

        override fun onShowCustomView(
            paramView: View?,
            paramCustomViewCallback: CustomViewCallback?
        ) {
            if (mCustomView != null) {
                onHideCustomView()
                return
            }
            mCustomView = paramView
            mOriginalSystemUiVisibility = requireActivity().window.decorView.systemUiVisibility
            mOriginalOrientation = requestedOrientation
            mCustomViewCallback = paramCustomViewCallback
            (requireActivity().window.decorView as FrameLayout).addView(mCustomView, FrameLayout.LayoutParams(-1, -1))
            requireActivity().window.decorView.systemUiVisibility = 3846 or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        webView.saveState(outState)
    }
}