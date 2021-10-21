package translator

import org.springframework.stereotype.Service

@Service
class TranslatorServiceImpl : TranslatorService {
    //Here we should use an external API or some libraries in order to make a real translator
    override fun translate(langFrom: String, langTo: String, text: String): String {
        return if(langFrom == "en" && langTo == "esp" && text == "Hello,translate me!"){
            "Hola,traduceme!"
        } else if(langFrom == "esp" && langTo == "en" && text == "Hola,traduceme!"){
            "Hello,translate me!"
        }else{
            "Im just a dummy translator, I cant translate anything else"
        }
    }
}