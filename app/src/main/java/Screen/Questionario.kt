package Screen

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

@Composable
fun Questionario(modifier: Modifier = Modifier) {
    var numeroQuestao by remember {
        mutableStateOf(1)
    }
    var pergunta = "Qual sei lá o que?"
    Column(
        modifier.fillMaxSize()
            .background(Color(82, 32, 93, 255)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(com.aphamogged.quiz.R.drawable.pergunta),
            contentDescription = "IMC_Icon",
            modifier = Modifier.size(75.dp)
                .padding(16.dp)
        )
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
            //Componente
            Card(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "${pergunta}",
                        fontSize = 24.sp
                    )
                    //Componente
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Button(
                            modifier = Modifier.fillMaxWidth()
                                .border(
                                    width = 1.dp,
                                    color = Color(179, 182, 179, 255),
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            colors = ButtonDefaults.buttonColors(
                                Color(232, 228, 228, 203)
                            ),
                            onClick = {

                            },
                            shape = RoundedCornerShape(10.dp,)
                        ){
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Alternativa",
                                textAlign = TextAlign.Start,
                                fontSize = 24.sp,
                                color = Color(11,11,11),
                                fontWeight = FontWeight(400)
                            )
                        }
                        Button(
                            modifier = Modifier.fillMaxWidth()
                                .border(
                                    width = 1.dp,
                                    color = Color(179, 182, 179, 255),
                                    shape = RoundedCornerShape(10.dp)
                                ),
                            colors = ButtonDefaults.buttonColors(
                                Color(232, 228, 228, 203)
                            ),
                            onClick = {

                            },
                            shape = RoundedCornerShape(10.dp,)
                        ){
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Alternativa",
                                textAlign = TextAlign.Start,
                                fontSize = 24.sp,
                                color = Color(11,11,11),
                                fontWeight = FontWeight(400)
                            )
                        }
                    }
                    Button(
                        modifier = Modifier.width(40.dp),
                        onClick = {}
                    ) {
                        Text("Avançar")
                    }

                }


            }
        }


    }
}
