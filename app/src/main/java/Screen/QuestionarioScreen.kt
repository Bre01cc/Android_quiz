package Screen

import Questoes.Pergunta
import Questoes.ValidarQuestao
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
fun QuestionarioScreen(navController: NavController,nome : String) {
    var numeroQuestao by remember {
        mutableStateOf(1)
    }

    var statusDoButton by remember {
        mutableStateOf(false)
    }

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

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(82, 32, 93, 255)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoApp(tamanho = 75)

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
                alternativaCorreta  = questoes[numeroQuestao-1].alternativaCorreta)

            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 70.dp)
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        if (numeroQuestao > 3){
                            navController.navigate("")
                        }else{
                            numeroQuestao = numeroQuestao + 1
                        }
                    },

                ) {
                    Text("Avançar")
                }
            }

        }


    }
}
