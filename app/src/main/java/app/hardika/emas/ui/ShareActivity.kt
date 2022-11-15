package app.hardika.emas.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import app.hardika.emas.AppPref
import app.hardika.emas.databinding.ActivityShareBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShareActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShareBinding
    var answerUr1Tabel1a = ""
    var answerUr1Tabel1b = ""
    var answerUr1Tabel1c = ""
    var answerUr1Tabel1d = ""
    var answerUr2 = ""
    var answerUr3 = ""
    var answerUr4 = ""
    var answerUrP1 = ""
    var answerUrP2 = ""

    var answerDp1Tabel1a = ""
    var answerDp1Tabel1b = ""
    var answerDp1Tabel1c = ""
    var answerDp2 = ""
    var answerDp3 = ""
    var answerDp4 = ""
    var answerDp5 = ""
    var answerDpSt = ""
    var answerDpP3 = ""
    var answerDpP4 = ""

    var answerBt1 = ""
    var answerBt2 = ""
    var answerBt3 = ""
    var answerBt4 = ""
    var answerBtP5 = ""

    var answerBnt1 = ""
    var answerBnt2 = ""
    var answerBnt3 = ""
    var answerBnt4 = ""
    var answerBntST = ""
    var answerBntP6 = ""

    var answerEb1 =""
    var answerEb2 =""
    var answerEb3 =""
    var answerEb4 =""
    var answerEb5 =""
    var answerEb6 =""
    var answerEb7 =""
    var answerEb8 =""
    var answerEb9 =""
    var answerEb10 =""
    var answerEb11 =""
    var answerEb12 =""
    var answerEb13 =""
    var answerEb14 =""
    var answerEb15 =""
    var answerEb16 =""
    var answerEb17 =""
    var answerEb18 =""

    var pilganScore = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityShareBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        val view = binding.root
        setContentView(view)

        val appPreferences = AppPref(this)

        //Untung Rugi

        appPreferences.pilganScore.asLiveData().observe(this, Observer {
            pilganScore = it.toString()
        })

        appPreferences.answerUr1Tabel1a.asLiveData().observe(this, Observer {
            answerUr1Tabel1a = it!!
        })

        appPreferences.answerUr1Tabel1b.asLiveData().observe(this, Observer {
            answerUr1Tabel1b = it!!
        })

        appPreferences.answerUr1Tabel1c.asLiveData().observe(this, Observer {
            answerUr1Tabel1c = it!!
        })

        appPreferences.answerUr1Tabel1d.asLiveData().observe(this, Observer {
            answerUr1Tabel1d = it!!
        })

        appPreferences.answerUr2.asLiveData().observe(this, Observer {
            answerUr2 = it!!
        })

        appPreferences.answerUr3.asLiveData().observe(this, Observer {
            answerUr3 = it!!
        })

        appPreferences.answerUr4.asLiveData().observe(this, Observer {
            answerUr4 = it!!
        })

        appPreferences.answerUrP1.asLiveData().observe(this, Observer {
            answerUrP1 = it!!
        })

        appPreferences.answerUrP2.asLiveData().observe(this, Observer {
            answerUrP2 = it!!
        })

        //Diskon Pajak

        appPreferences.answerDp1Tabel1a.asLiveData().observe(this, Observer {
            answerDp1Tabel1a = it!!
        })

        appPreferences.answerDp1Tabel1b.asLiveData().observe(this, Observer {
            answerDp1Tabel1b = it!!
        })

        appPreferences.answerDp1Tabel1c.asLiveData().observe(this, Observer {
            answerDp1Tabel1c = it!!
        })

        appPreferences.answerDp2.asLiveData().observe(this, Observer {
            answerDp2 = it!!
        })

        appPreferences.answerDp3.asLiveData().observe(this, Observer {
            answerDp3 = it!!
        })

        appPreferences.answerDp4.asLiveData().observe(this, Observer {
            answerDp4 = it!!
        })

        appPreferences.answerDp5.asLiveData().observe(this, Observer {
            answerDp5 = it!!
        })

        appPreferences.answerDpSt.asLiveData().observe(this, Observer {
            answerDpSt = it!!
        })

        appPreferences.answerDpP3.asLiveData().observe(this, Observer {
            answerDpP3 = it!!
        })

        appPreferences.answerDpP4.asLiveData().observe(this, Observer {
            answerDpP4 = it!!
        })

        //Bunga Tunggal

        appPreferences.answerBt1.asLiveData().observe(this, Observer {
            answerBt1 = it!!
        })

        appPreferences.answerBt2.asLiveData().observe(this, Observer {
            answerBt2 = it!!
        })

        appPreferences.answerBt3.asLiveData().observe(this, Observer {
            answerBt3 = it!!
        })

        appPreferences.answerBt4.asLiveData().observe(this, Observer {
            answerBt4 = it!!
        })

        appPreferences.answerBtP5.asLiveData().observe(this, Observer {
            answerBtP5 = it!!
        })

        //Bruto netto tara

        appPreferences.answerBnt1.asLiveData().observe(this, Observer {
            answerBnt1 = it!!
        })

        appPreferences.answerBnt2.asLiveData().observe(this, Observer {
            answerBnt2 = it!!
        })

        appPreferences.answerBnt3.asLiveData().observe(this, Observer {
            answerBnt3 = it!!
        })

        appPreferences.answerBnt4.asLiveData().observe(this, Observer {
            answerBnt4 = it!!
        })

        appPreferences.answerBntST.asLiveData().observe(this, Observer {
            answerBntST = it!!
        })

        appPreferences.answerBntP6.asLiveData().observe(this, Observer {
            answerBntP6 = it!!
        })

        //Evaluasi belajar

        appPreferences.answerEb1.asLiveData().observe(this, Observer {
            answerEb1 = it!!
        })

        appPreferences.answerEb2.asLiveData().observe(this, Observer {
            answerEb2 = it!!
        })

        appPreferences.answerEb3.asLiveData().observe(this, Observer {
            answerEb3 = it!!
        })

        appPreferences.answerEb4.asLiveData().observe(this, Observer {
            answerEb4 = it!!
        })

        appPreferences.answerEb5.asLiveData().observe(this, Observer {
            answerEb5 = it!!
        })

        appPreferences.answerEb6.asLiveData().observe(this, Observer {
            answerEb6 = it!!
        })

        appPreferences.answerEb7.asLiveData().observe(this, Observer {
            answerEb7 = it!!
        })

        appPreferences.answerEb8.asLiveData().observe(this, Observer {
            answerEb8 = it!!
        })

        appPreferences.answerEb9.asLiveData().observe(this, Observer {
            answerEb9 = it!!
        })

        appPreferences.answerEb10.asLiveData().observe(this, Observer {
            answerEb10 = it!!
        })

        appPreferences.answerEb11.asLiveData().observe(this, Observer {
            answerEb11 = it!!
        })

        appPreferences.answerEb12.asLiveData().observe(this, Observer {
            answerEb12 = it!!
        })

        appPreferences.answerEb13.asLiveData().observe(this, Observer {
            answerEb13 = it!!
        })

        appPreferences.answerEb14.asLiveData().observe(this, Observer {
            answerEb14 = it!!
        })

        appPreferences.answerEb15.asLiveData().observe(this, Observer {
            answerEb15 = it!!
        })

        appPreferences.answerEb16.asLiveData().observe(this, Observer {
            answerEb16 = it!!
        })

        appPreferences.answerEb17.asLiveData().observe(this, Observer {
            answerEb17 = it!!
        })

        appPreferences.answerEb18.asLiveData().observe(this, Observer {
            answerEb18 = it!!
        })

        binding.btnShare.setOnClickListener {
            val shareText = "Rekap Jawaban Siswa\n\n" +
                    "UNTUNG RUGI\n" +
                    "Jawaban Soal No 1 Tabel Untung Rugi:\n" +
                    "a) $answerUr1Tabel1a\n" +
                    "b) $answerUr1Tabel1b\n" +
                    "c) $answerUr1Tabel1c\n" +
                    "d) $answerUr1Tabel1d\n" +
                    "Jawaban Soal No 2 Uraian: $answerUr2\n" +
                    "Jawaban Soal No 3 Uraian: $answerUr3\n" +
                    "Jawaban Soal No 4 Uraian: $answerUr4\n" +
                    "Jawaban Permasalahan 1: $answerUrP1\n" +
                    "Jawaban Permasalahan 2: $answerUrP2\n\n" +
                    "DISKON PAJAK\n" +
                    "Jawaban Soal No 1 Tabel Diskon Pajak:\n" +
                    "a) $answerDp1Tabel1a\n" +
                    "b) $answerDp1Tabel1b\n" +
                    "c) $answerDp1Tabel1c\n" +
                    "Jawaban Soal No 2 Uraian: $answerDp2\n" +
                    "Jawaban Soal No 3 Uraian: $answerDp3\n" +
                    "Jawaban Soal No 4 Uraian: $answerDp4\n" +
                    "Jawaban Soal No 5 Uraian: $answerDp5\n" +
                    "Jawaban Soal Tantangan: $answerDpSt\n" +
                    "Jawaban Permasalahan 3: $answerDpP3\n" +
                    "Jawaban Permasalahan 4: $answerDpP4\n\n" +
                    "BUNGA TUNGGAL\n" +
                    "Jawaban Soal No 1 Uraian: $answerBt1\n" +
                    "Jawaban Soal No 2 Uraian: $answerBt2\n" +
                    "Jawaban Soal No 3 Uraian: $answerBt3\n" +
                    "Jawaban Soal No 4 Uraian: $answerBt4\n" +
                    "Jawaban Permasalahan 5: $answerBtP5\n\n" +
                    "BRUTO, NETTO, TARA\n" +
                    "Jawaban Soal No 1 Uraian: $answerBnt1\n" +
                    "Jawaban Soal No 2 Uraian: $answerBnt2\n" +
                    "Jawaban Soal No 3 Uraian: $answerBnt3\n" +
                    "Jawaban Soal No 4 Uraian: $answerBnt4\n" +
                    "Jawaban Soal Tantangan: $answerBntST\n" +
                    "Jawaban Permasalahan 6: $answerBntP6\n\n" +
                    "Hasil Skor Evaluasi Belajar: ${(pilganScore.toInt() + 2)*5}"

            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"

            intent.setPackage("com.whatsapp")
            intent.putExtra(Intent.EXTRA_TEXT, shareText) //
            startActivity(Intent.createChooser(intent, shareText))
        }


    }
}