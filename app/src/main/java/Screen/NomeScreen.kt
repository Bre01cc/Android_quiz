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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import componente.LogoApp

@Composable
fun NomeScreen(navController: NavController) {
    var nome by remember  {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color(82, 32, 93, 255)),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)

    ) {
        LogoApp(tamanho = 60)
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Qual seu nome?",
                fontSize = 24.sp,
                color = Color.White
            )

        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.spacedBy(25.dp),
            Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = nome,
                onValueChange = {
                    nome = it
                },
                colors = OutlinedTextFieldDefaults.colors(
                    Color.White
                )
            )
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(horizontal = 110.dp),
                Arrangement.spacedBy(10.dp)
            ) {
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        nome.trim()
                        if(nome != null && nome != ""){
                            navController.navigate("questionario/nome = ${nome}")
                        }
                    }
                ) {
                    Text(
                        text = "Prosseguir"
                    )
                }
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        navController.popBackStack()
                    }
                ) {
                    Text(
                        text = "Voltar"
                    )
                }
            }

        }

    }
}