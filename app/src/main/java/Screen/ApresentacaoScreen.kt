package Screen

import androidx.compose.foundation.Image
import componente.LogoApp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.aphamogged.quiz.R
import componente.LogoApp

@Composable
fun ApresentacaoScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(82, 32, 93, 255)),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            LogoApp(tamanho = 160)
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 95.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                Text(
                    text = "QUIZATRON 3000",
                    fontSize = 24.sp,
                    color = Color.White
                )
                Button(
                    modifier= Modifier
                        .fillMaxWidth(),
                    onClick = {
                    navController.navigate("nome")
                    }

                ) {
                    Text("COMENÇAR!")
                }
            }

        }

    }
}

