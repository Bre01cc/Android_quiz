package Quiz

data class Pergunta(
    val texto : String,
    val alternativas : List<String>,
    val alternativaCorreta : Int
)