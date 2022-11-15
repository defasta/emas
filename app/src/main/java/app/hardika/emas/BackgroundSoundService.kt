package app.hardika.emas

import android.app.Service
import android.content.Intent
import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.IBinder

class BackgroundSoundService : Service() {
    internal lateinit var player: MediaPlayer
    override fun onBind(arg0: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
      //  val afd = applicationContext.assets.openFd("backsound.mp3") as AssetFileDescriptor
        player = MediaPlayer.create(this, R.raw.backsound)
        //player.setDataSource(afd.fileDescriptor)
        player.isLooping = true // Set looping
        player.setVolume(100f, 100f)

    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        player.start()
        return START_STICKY
    }

    override fun onStart(intent: Intent, startId: Int) {
        player.start()
        // TO DO
    }

    fun onUnBind(arg0: Intent): IBinder? {
        // TO DO Auto-generated method
        return null
    }

    fun onStop() {

    }

    fun onPause() {
        player = MediaPlayer.create(this, R.raw.backsound)
        player.pause()
    }

    override fun onDestroy() {
        player.stop()
        player.release()
    }

    override fun onLowMemory() {

    }

    companion object {
        private val TAG: String? = null
    }
}