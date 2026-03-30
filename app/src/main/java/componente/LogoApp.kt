package componente

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aphamogged.quiz.R

@Composable
fun LogoApp(modifier: Modifier = Modifier,tamanho : Int) {
    Image(
        painter = painterResource(R.drawable.pergunta),
        contentDescription = "IMC_Icon",
        modifier = Modifier.size(tamanho.dp)
    )
}