package app.hardika.emas

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "my_data_store")

class AppPref @Inject constructor(@ApplicationContext context: Context) {
    private val appContext = context.applicationContext

    val aritmatikaStatus: Flow<Boolean?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[IS_ARITMATIKA_DONE]
        }

    suspend fun saveAritmatikaStatus(isAritmatikaDone: Boolean) {
        appContext.dataStore.edit { preferences ->
            preferences[IS_ARITMATIKA_DONE] = isAritmatikaDone
        }
    }

    val kegiatanBelajarStatus: Flow<Boolean?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[IS_KEGIATAN_BELAJAR_DONE]
        }

    suspend fun saveKegiatanBelajarStatus(isKegiatanBelajarDone: Boolean) {
        appContext.dataStore.edit { preferences ->
            preferences[IS_KEGIATAN_BELAJAR_DONE] = isKegiatanBelajarDone
        }
    }

    val untungRugiStatus: Flow<Boolean?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[IS_UNTUNG_RUGI_DONE]
        }

    suspend fun saveUntungRugiStatus(isUntungRugi: Boolean) {
        appContext.dataStore.edit { preferences ->
            preferences[IS_UNTUNG_RUGI_DONE] = isUntungRugi
        }
    }

    val diskonPajakStatus: Flow<Boolean?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[IS_DISKON_PAJAK_DONE]
        }

    suspend fun saveDiskonPajakStatus(isDiskonPajak: Boolean) {
        appContext.dataStore.edit { preferences ->
            preferences[IS_DISKON_PAJAK_DONE] = isDiskonPajak
        }
    }

    val bungaTunggalStatus: Flow<Boolean?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[IS_BUNGA_TUNGGAL_DONE]
        }

    suspend fun saveBungaTunggalStatus(isBungaTunggal: Boolean) {
        appContext.dataStore.edit { preferences ->
            preferences[IS_BUNGA_TUNGGAL_DONE] = isBungaTunggal
        }
    }

    val pilganScore: Flow<Int?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[SCORE_PILGAN]
        }

    suspend fun savePilganScore(pilganScore: Int) {
        appContext.dataStore.edit { preferences ->
            preferences[SCORE_PILGAN] = pilganScore
        }
    }

    // UNTUNG RUGI

    val answerUr1Tabel1a: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR1_TABEL1_A]
        }

    suspend fun saveAnswerUr1Tabel1a(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR1_TABEL1_A] = answer
        }
    }

    val answerUr1Tabel1b: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR1_TABEL1_B]
        }

    suspend fun saveAnswerUr1Tabel1b(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR1_TABEL1_B] = answer
        }
    }

    val answerUr1Tabel1c: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR1_TABEL1_C]
        }

    suspend fun saveAnswerUr1Tabel1c(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR1_TABEL1_C] = answer
        }
    }

    val answerUr1Tabel1d: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR1_TABEL1_D]
        }

    suspend fun saveAnswerUr1Tabel1d(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR1_TABEL1_D] = answer
        }
    }

    val answerUr2: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR2]
        }

    suspend fun saveAnswerUr2(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR2] = answer
        }
    }

    val answerUr3: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR3]
        }

    suspend fun saveAnswerUr3(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR3] = answer
        }
    }

    val answerUr4: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_UR4]
        }

    suspend fun saveAnswerUr4(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_UR4] = answer
        }
    }

    val answerUrP1: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_URP1]
        }

    suspend fun saveAnswerUrP1(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_URP1] = answer
        }
    }

    val answerUrP2: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_URP2]
        }

    suspend fun saveAnswerUrP2(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_URP2] = answer
        }
    }

    //DISKON PAJAK

    val answerDp1Tabel1a: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP1_TABEL1_A]
        }

    suspend fun saveAnswerDp1Tabel1a(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP1_TABEL1_A] = answer
        }
    }

    val answerDp1Tabel1b: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP1_TABEL1_B]
        }

    suspend fun saveAnswerDp1Tabel1b(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP1_TABEL1_B] = answer
        }
    }

    val answerDp1Tabel1c: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP1_TABEL1_C]
        }

    suspend fun saveAnswerDp1Tabel1c(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP1_TABEL1_C] = answer
        }
    }

    val answerDp2: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP2]
        }

    suspend fun saveAnswerDp2(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP2] = answer
        }
    }

    val answerDp3: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP3]
        }

    suspend fun saveAnswerDp3(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP3] = answer
        }
    }

    val answerDp4: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP4]
        }

    suspend fun saveAnswerDp4(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP4] = answer
        }
    }

    val answerDp5: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DP5]
        }

    suspend fun saveAnswerDp5(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DP5] = answer
        }
    }

    val answerDpSt: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DPST]
        }

    suspend fun saveAnswerDpSt(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DPST] = answer
        }
    }

    val answerDpP3: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DPP3]
        }

    suspend fun saveAnswerDpP3(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DPP3] = answer
        }
    }

    val answerDpP4: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_DPP4]
        }

    suspend fun saveAnswerDpP4(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_DPP4] = answer
        }
    }

    //BUNGA TUNGGAL

    val answerBt1: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BT1]
        }

    suspend fun saveAnswerBt1(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BT1] = answer
        }
    }

    val answerBt2: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BT2]
        }

    suspend fun saveAnswerBt2(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BT2] = answer
        }
    }

    val answerBt3: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BT3]
        }

    suspend fun saveAnswerBt3(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BT3] = answer
        }
    }

    val answerBt4: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BT4]
        }

    suspend fun saveAnswerBt4(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BT4] = answer
        }
    }

    val answerBtP5: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BTP5]
        }

    suspend fun saveAnswerBtP5(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BTP5] = answer
        }
    }

    //Bruto Netto Tara

    val answerBnt1: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BNT1]
        }

    suspend fun saveAnswerBnt1(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BNT1] = answer
        }
    }

    val answerBnt2: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BNT2]
        }

    suspend fun saveAnswerBnt2(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BNT2] = answer
        }
    }

    val answerBnt3: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BNT3]
        }

    suspend fun saveAnswerBnt3(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BNT3] = answer
        }
    }

    val answerBnt4: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BNT4]
        }

    suspend fun saveAnswerBnt4(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BNT4] = answer
        }
    }

    val answerBntST: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BNTST]
        }

    suspend fun saveAnswerBntST(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BNTST] = answer
        }
    }

    val answerBntP6: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_BNTP6]
        }

    suspend fun saveAnswerBntP6(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_BNTP6] = answer
        }
    }

    //EVALUASI BELAJAR

    val answerEb1: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB1]
        }

    suspend fun saveAnswerEb1(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB1] = answer
        }
    }

    val answerEb2: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB2]
        }

    suspend fun saveAnswerEb2(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB2] = answer
        }
    }

    val answerEb3: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB3]
        }

    suspend fun saveAnswerEb3(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB3] = answer
        }
    }

    val answerEb4: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB4]
        }

    suspend fun saveAnswerEb4(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB4] = answer
        }
    }

    val answerEb5: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB5]
        }

    suspend fun saveAnswerEb5(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB5] = answer
        }
    }

    val answerEb6: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB6]
        }

    suspend fun saveAnswerEb6(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB6] = answer
        }
    }

    val answerEb7: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB7]
        }

    suspend fun saveAnswerEb7(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB7] = answer
        }
    }

    val answerEb8: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB8]
        }

    suspend fun saveAnswerEb8(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB8] = answer
        }
    }

    val answerEb9: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB9]
        }

    suspend fun saveAnswerEb9(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB9] = answer
        }
    }

    val answerEb10: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB10]
        }

    suspend fun saveAnswerEb10(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB10] = answer
        }
    }

    val answerEb11: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB11]
        }

    suspend fun saveAnswerEb11(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB11] = answer
        }
    }

    val answerEb12: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB12]
        }

    suspend fun saveAnswerEb12(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB12] = answer
        }
    }

    val answerEb13: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB13]
        }

    suspend fun saveAnswerEb13(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB13] = answer
        }
    }

    val answerEb14: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB14]
        }

    suspend fun saveAnswerEb14(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB14] = answer
        }
    }

    val answerEb15: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB15]
        }

    suspend fun saveAnswerEb15(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB15] = answer
        }
    }

    val answerEb16: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB16]
        }

    suspend fun saveAnswerEb16(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB16] = answer
        }
    }

    val answerEb17: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB17]
        }

    suspend fun saveAnswerEb17(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB17] = answer
        }
    }

    val answerEb18: Flow<String?>
        get() = appContext.dataStore.data.map { preferences ->
            preferences[ANSWER_EB18]
        }

    suspend fun saveAnswerEb18(answer: String) {
        appContext.dataStore.edit { preferences ->
            preferences[ANSWER_EB18] = answer
        }
    }


    companion object {
        private val IS_ARITMATIKA_DONE = booleanPreferencesKey("key_aritmatika_done")
        private val IS_KEGIATAN_BELAJAR_DONE = booleanPreferencesKey("key_kegiatan_belajar_done")
        private val IS_UNTUNG_RUGI_DONE = booleanPreferencesKey("key_untung_rugi_done")
        private val IS_DISKON_PAJAK_DONE = booleanPreferencesKey("key_diskon_pajak_done")
        private val IS_BUNGA_TUNGGAL_DONE = booleanPreferencesKey("key_bunga_tunggal_done")

        private val SCORE_PILGAN = intPreferencesKey("key_score_pilgan")

        private val ANSWER_UR1_TABEL1_A = stringPreferencesKey("key_answer_ur1_tabel1_a")
        private val ANSWER_UR1_TABEL1_B = stringPreferencesKey("key_answer_ur1_tabel1_b")
        private val ANSWER_UR1_TABEL1_C = stringPreferencesKey("key_answer_ur1_tabel1_c")
        private val ANSWER_UR1_TABEL1_D = stringPreferencesKey("key_answer_ur1_tabel1_d")
        private val ANSWER_UR2 = stringPreferencesKey("key_answer_ur2")
        private val ANSWER_UR3 = stringPreferencesKey("key_answer_ur3")
        private val ANSWER_UR4 = stringPreferencesKey("key_answer_ur4")
        private val ANSWER_URP1 = stringPreferencesKey("key_answer_urp1")
        private val ANSWER_URP2 = stringPreferencesKey("key_answer_urp2")

        private val ANSWER_DP1_TABEL1_A = stringPreferencesKey("key_answer_dp1_tabel1_a")
        private val ANSWER_DP1_TABEL1_B = stringPreferencesKey("key_answer_dp1_tabel1_b")
        private val ANSWER_DP1_TABEL1_C = stringPreferencesKey("key_answer_dp1_tabel1_c")
        private val ANSWER_DP2 = stringPreferencesKey("key_answer_dp2")
        private val ANSWER_DP3 = stringPreferencesKey("key_answer_dp3")
        private val ANSWER_DP4 = stringPreferencesKey("key_answer_dp4")
        private val ANSWER_DP5 = stringPreferencesKey("key_answer_dp5")
        private val ANSWER_DPST = stringPreferencesKey("key_answer_dpst")
        private val ANSWER_DPP3 = stringPreferencesKey("key_answer_dpp3")
        private val ANSWER_DPP4 = stringPreferencesKey("key_answer_dpp4")

        private val ANSWER_BT1 = stringPreferencesKey("key_answer_bt1")
        private val ANSWER_BT2 = stringPreferencesKey("key_answer_bt2")
        private val ANSWER_BT3 = stringPreferencesKey("key_answer_bt3")
        private val ANSWER_BT4 = stringPreferencesKey("key_answer_bt4")
        private val ANSWER_BTP5 = stringPreferencesKey("key_answer_btp5")

        private val ANSWER_BNT1 = stringPreferencesKey("key_answer_bnt1")
        private val ANSWER_BNT2 = stringPreferencesKey("key_answer_bnt2")
        private val ANSWER_BNT3 = stringPreferencesKey("key_answer_bnt3")
        private val ANSWER_BNT4 = stringPreferencesKey("key_answer_bnt4")
        private val ANSWER_BNTST = stringPreferencesKey("key_answer_bntst")
        private val ANSWER_BNTP6 = stringPreferencesKey("key_answer_bntp6")

        private val ANSWER_EB1 = stringPreferencesKey("key_answer_eb1")
        private val ANSWER_EB2 = stringPreferencesKey("key_answer_eb2")
        private val ANSWER_EB3 = stringPreferencesKey("key_answer_eb3")
        private val ANSWER_EB4 = stringPreferencesKey("key_answer_eb4")
        private val ANSWER_EB5 = stringPreferencesKey("key_answer_eb5")
        private val ANSWER_EB6 = stringPreferencesKey("key_answer_eb6")
        private val ANSWER_EB7 = stringPreferencesKey("key_answer_eb7")
        private val ANSWER_EB8 = stringPreferencesKey("key_answer_eb8")
        private val ANSWER_EB9 = stringPreferencesKey("key_answer_eb9")
        private val ANSWER_EB10 = stringPreferencesKey("key_answer_eb10")
        private val ANSWER_EB11 = stringPreferencesKey("key_answer_eb11")
        private val ANSWER_EB12 = stringPreferencesKey("key_answer_eb12")
        private val ANSWER_EB13 = stringPreferencesKey("key_answer_eb13")
        private val ANSWER_EB14 = stringPreferencesKey("key_answer_eb14")
        private val ANSWER_EB15 = stringPreferencesKey("key_answer_eb15")
        private val ANSWER_EB16 = stringPreferencesKey("key_answer_eb16")
        private val ANSWER_EB17 = stringPreferencesKey("key_answer_eb17")
        private val ANSWER_EB18 = stringPreferencesKey("key_answer_eb18")
    }

}

