package Screen

import Quiz.Pergunta
import Quiz.QuizViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import componente.CardApp
import componente.LogoApp


@Composable
fun QuestionarioScreen(
    navController: NavController,
    nome : String,
    viewModel: QuizViewModel
) {

    val numeroQuestao = viewModel.numeroQuestao
    val questoes = viewModel.questoes
    val acerto = viewModel.acerto
    var avancar: Boolean
    Column(modifier = Modifier.fillMaxSize()
            .background(Color(82, 32, 93, 255)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LogoApp(tamanho = 80)

        Column(modifier = Modifier
            .padding(horizontal = 15.dp)
            .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        )
        {

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 60.dp),
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .height(45.dp)
                        .background(Color(42, 8, 63, 255),shape = RoundedCornerShape(5.dp)),
                    Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically


                ) {
                    Text(
                        text = "Pergunta ${numeroQuestao} de 3",
                        fontSize = 24.sp,
                        color = Color.White
                    )
                }

            }

            CardApp(modifier = Modifier, alternativas = questoes[numeroQuestao -1].alternativas,
                questao = questoes[numeroQuestao-1].texto,
                alternativaCorreta  = questoes[numeroQuestao-1].alternativaCorreta, viewModel = viewModel)

            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 70.dp)
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    enabled = viewModel.statusDoButton,
                    onClick = {
                     avancar  = viewModel.proximaQuestao()
                        viewModel.desativaAvancar()
                        viewModel.ativarQuestao()
                        viewModel.resetPadrao()
                       if (avancar == false){
                           navController.navigate("resultado/${nome}/${acerto}")
                       }

                    },

                ) {
                    Text("Avançar")
                }
            }

        }


    }
}
