package translator

interface TranslatorService {

    fun translate(langFrom: String, langTo: String , text: String): String;
}