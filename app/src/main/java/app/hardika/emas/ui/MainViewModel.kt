package app.hardika.emas.ui

import androidx.lifecycle.ViewModel
import app.hardika.emas.AppPref
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val preferences: AppPref
): ViewModel(){
    suspend fun saveAritmatikaStatus(isAritmatikaDone: Boolean){
        preferences.saveAritmatikaStatus(isAritmatikaDone)
    }

    suspend fun saveUntungRugiStatus(isUntungRugiDone: Boolean){
        preferences.saveUntungRugiStatus(isUntungRugiDone)
    }

    suspend fun saveDiskonPajakStatus(isDiskonPajakDone: Boolean){
        preferences.saveDiskonPajakStatus(isDiskonPajakDone)
    }

    suspend fun saveBungaTuggalStatus(isBungaTunggalDone: Boolean){
        preferences.saveBungaTunggalStatus(isBungaTunggalDone)
    }

    suspend fun saveKegiatanBelajarStatus(isKegiatanBelajarDone: Boolean){
        preferences.saveKegiatanBelajarStatus(isKegiatanBelajarDone)
    }

    suspend fun savePilganScore(pilganScore: Int){
        preferences.savePilganScore(pilganScore)
    }

    suspend fun saveAnswerUr1Tabel1a(answer: String){
        preferences.saveAnswerUr1Tabel1a(answer)
    }

    suspend fun saveAnswerUr1Tabel1b(answer: String){
        preferences.saveAnswerUr1Tabel1b(answer)
    }

    suspend fun saveAnswerUr1Tabel1c(answer: String){
        preferences.saveAnswerUr1Tabel1c(answer)
    }

    suspend fun saveAnswerUr1Tabel1d(answer: String){
        preferences.saveAnswerUr1Tabel1d(answer)
    }

    suspend fun saveAnswerUr2(answer: String){
        preferences.saveAnswerUr2(answer)
    }

    suspend fun saveAnswerUr3(answer: String){
        preferences.saveAnswerUr3(answer)
    }

    suspend fun saveAnswerUr4(answer: String){
        preferences.saveAnswerUr4(answer)
    }

    suspend fun saveAnswerUrP1(answer: String){
        preferences.saveAnswerUrP1(answer)
    }

    suspend fun saveAnswerUrP2(answer: String){
        preferences.saveAnswerUrP2(answer)
    }

    suspend fun saveAnswerDp1Tabel1a(answer: String){
        preferences.saveAnswerDp1Tabel1a(answer)
    }

    suspend fun saveAnswerDp1Tabel1b(answer: String){
        preferences.saveAnswerDp1Tabel1b(answer)
    }

    suspend fun saveAnswerDp1Tabel1c(answer: String){
        preferences.saveAnswerDp1Tabel1c(answer)
    }

    suspend fun saveAnswerDp2(answer: String){
        preferences.saveAnswerDp2(answer)
    }

    suspend fun saveAnswerDp3(answer: String){
        preferences.saveAnswerDp3(answer)
    }

    suspend fun saveAnswerDp4(answer: String){
        preferences.saveAnswerDp4(answer)
    }

    suspend fun saveAnswerDp5(answer: String){
        preferences.saveAnswerDp5(answer)
    }

    suspend fun saveAnswerDpSt(answer: String){
        preferences.saveAnswerDpSt(answer)
    }

    suspend fun saveAnswerDpP3(answer: String){
        preferences.saveAnswerDpP3(answer)
    }

    suspend fun saveAnswerDpP4(answer: String){
        preferences.saveAnswerDpP4(answer)
    }

    suspend fun saveAnswerBt1(answer: String){
        preferences.saveAnswerBt1(answer)
    }

    suspend fun saveAnswerBt2(answer: String){
        preferences.saveAnswerBt2(answer)
    }

    suspend fun saveAnswerBt3(answer: String){
        preferences.saveAnswerBt3(answer)
    }

    suspend fun saveAnswerBt4(answer: String){
        preferences.saveAnswerBt4(answer)
    }

    suspend fun saveAnswerBtP5(answer: String){
        preferences.saveAnswerBtP5(answer)
    }

    suspend fun saveAnswerBnt1(answer: String){
        preferences.saveAnswerBnt1(answer)
    }

    suspend fun saveAnswerBnt2(answer: String){
        preferences.saveAnswerBnt2(answer)
    }

    suspend fun saveAnswerBnt3(answer: String){
        preferences.saveAnswerBnt3(answer)
    }

    suspend fun saveAnswerBnt4(answer: String){
        preferences.saveAnswerBnt4(answer)
    }

    suspend fun saveAnswerBntSt(answer: String){
        preferences.saveAnswerBntST(answer)
    }

    suspend fun saveAnswerBntP6(answer: String){
        preferences.saveAnswerBntP6(answer)
    }

    suspend fun saveAnswerEb1(answer: String){
        preferences.saveAnswerEb1(answer)
    }

    suspend fun saveAnswerEb2(answer: String){
        preferences.saveAnswerEb2(answer)
    }

    suspend fun saveAnswerEb3(answer: String){
        preferences.saveAnswerEb3(answer)
    }

    suspend fun saveAnswerEb4(answer: String){
        preferences.saveAnswerEb4(answer)
    }

    suspend fun saveAnswerEb5(answer: String){
        preferences.saveAnswerEb5(answer)
    }

    suspend fun saveAnswerEb6(answer: String){
        preferences.saveAnswerEb6(answer)
    }

    suspend fun saveAnswerEb7(answer: String){
        preferences.saveAnswerEb7(answer)
    }

    suspend fun saveAnswerEb8(answer: String){
        preferences.saveAnswerEb8(answer)
    }

    suspend fun saveAnswerEb9(answer: String){
        preferences.saveAnswerEb9(answer)
    }

    suspend fun saveAnswerEb10(answer: String){
        preferences.saveAnswerEb10(answer)
    }

    suspend fun saveAnswerEb11(answer: String){
        preferences.saveAnswerEb11(answer)
    }

    suspend fun saveAnswerEb12(answer: String){
        preferences.saveAnswerEb12(answer)
    }

    suspend fun saveAnswerEb13(answer: String){
        preferences.saveAnswerEb13(answer)
    }

    suspend fun saveAnswerEb14(answer: String){
        preferences.saveAnswerEb14(answer)
    }

    suspend fun saveAnswerEb15(answer: String){
        preferences.saveAnswerEb15(answer)
    }

    suspend fun saveAnswerEb16(answer: String){
        preferences.saveAnswerEb16(answer)
    }

    suspend fun saveAnswerEb17(answer: String){
        preferences.saveAnswerEb17(answer)
    }

    suspend fun saveAnswerEb18(answer: String){
        preferences.saveAnswerEb18(answer)
    }
}