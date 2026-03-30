package componente

import Questoes.ValidarQuestao
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuestaoButton(modifier: Modifier = Modifier, alternativa: String, alternativaCorreta: Int, indexAlternativa : Int) {

    var colorAtual by remember  {
        mutableStateOf(Color.Transparent)
    }
    Button(
        modifier = Modifier.fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color(179, 182, 179, 255),
                shape = RoundedCornerShape(10.dp)
            ),
            colors = ButtonDefaults.buttonColors(
            colorAtual
             ),
             onClick = {
            var status = ValidarQuestao(alternativaCorreta,indexAlternativa)
            if (status == true){
            colorAtual = Color.Green
            }else{
                colorAtual = Color.Red
            }
        },
        shape = RoundedCornerShape(10.dp,)
    ){
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "$alternativa",
            textAlign = TextAlign.Start,
            fontSize = 24.sp,
            color = Color(11,11,11),
            fontWeight = FontWeight(400)
        )
    }
}