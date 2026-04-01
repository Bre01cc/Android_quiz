package Quiz

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class QuizViewModel: ViewModel(){

   private var _numeroQuestao by mutableStateOf(1)

    val numeroQuestao get()  = _numeroQuestao


    private var _statusDoButton by mutableStateOf(false)

    private var _reset by mutableStateOf(true)

    val reset get() = _reset

    val statusDoButton get() = _statusDoButton

    private var _statusDaQuestao by mutableStateOf(true)

    val statusDaQuestao  get() = _statusDaQuestao

    private var _resposta  by mutableStateOf(false)

    private var _acerto  by mutableStateOf(0)

    val acerto get() = _acerto

    val pergunta1 = Pergunta(texto = "Quando inciou a ditadura militar",
        alternativas = listOf("01/04/1964", "01/07/1965", "20/08/1968", "08/10/1954"),
        alternativaCorreta = 0)

    val pergunta2 = Pergunta(texto = "Quem foi o primeiro presidente do Brasil?",
        alternativas = listOf("Deodoro da Fonseca", "Getúlio Vargas", "Juscelino Kubitschek", "Dom Pedro II"),
        alternativaCorreta = 0)

    val pergunta3 = Pergunta(
        texto = "Qual é o país com maior população do mundo?",
        alternativas = listOf(
            "Estados Unidos", "Índia", "China", "Brasil"
        ),
        alternativaCorreta = 1
    )


    val questoes = listOf(pergunta1, pergunta2,pergunta3)

    fun proximaQuestao(): Boolean {
        if (numeroQuestao < questoes.size) {
            _numeroQuestao++
            return true
        }else{
            return false
        }
    }

    fun avancarQuestao (): Boolean{
        _statusDoButton = true
        return true
    }

    fun desativaAvancar(): Boolean{
        _statusDoButton = false
        return false
    }

    fun desativarQuestao(){
        _statusDaQuestao = false
    }

    fun ativarQuestao (){
        _statusDaQuestao = true
    }

    fun validarQuestao( questaoCorreta : Int, questaoAtual: Int) : Boolean {

       return questaoCorreta == questaoAtual

    }

    fun aumentarAcerto (){
        _acerto++
    }
    fun resetAlterar (){
        _reset = false
    }

    fun resetPadrao(){
        _reset = true
    }



}