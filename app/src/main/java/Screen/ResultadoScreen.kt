package Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import componente.LogoApp

@Composable
fun ResultadoScreen(navController: NavController) {
    val acertos = 0
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(82, 32, 93, 255)),
        verticalArrangement = Arrangement.Center

    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LogoApp(tamanho = 160)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = "Bom trabalho!",
                    fontSize = 24.sp,
                    color = Color.White
                )
                Text(
                    text = "Você acertou ${acertos} de 3 perguntas",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Row() {
                Button(
                    onClick = {

                    }
                ) {
                    Text(
                        text = "JOGAR NOVAMENTE",
                        fontSize = 24.sp
                    )
                }
            }
        }

    }

}