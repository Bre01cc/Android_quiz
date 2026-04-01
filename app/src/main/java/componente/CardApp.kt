package componente

import Quiz.QuizViewModel
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardApp(
    modifier: Modifier = Modifier,
    alternativas : List<String>,
    questao: String,
    alternativaCorreta : Int,
    viewModel: QuizViewModel) {
    //Componente
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            Color(82, 19, 119, 255)
        ),
        border = BorderStroke(2.dp, Color.Black),
    ) {
        var indexAtual = 0
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "$questao",
                fontSize = 24.sp
            )
            //Componente
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
              alternativas.forEach {
                  QuestaoButton(
                      modifier = Modifier,
                      alternativa = it,
                      viewModel = viewModel,
                      alternativaCorreta = alternativaCorreta,
                      indexDaAlternativa = indexAtual
                  )
                  indexAtual++
              }
            }

        }


    }
}