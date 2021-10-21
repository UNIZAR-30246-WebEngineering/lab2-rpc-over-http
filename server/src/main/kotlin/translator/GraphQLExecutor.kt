package translator

import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GraphQLExecutor {

    @Autowired
    var translatorService: TranslatorService? = null

    fun translationRequest(): DataFetcher<translationResponse>? {
        return DataFetcher { dataFetchingEnvironment: DataFetchingEnvironment ->

            val langFrom = dataFetchingEnvironment.getArgument<String>("langFrom")
            val langTo = dataFetchingEnvironment.getArgument<String>("langTo")
            val text = dataFetchingEnvironment.getArgument<String>("text")
            val translated_text = translatorService!!.translate(langFrom, langTo, text)
            System.out.println(translated_text)

            translationResponse(translated_text)
        }
    }



}