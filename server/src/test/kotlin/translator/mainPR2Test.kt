package translator

import org.hamcrest.Matchers
import org.json.JSONObject
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers


@RunWith(SpringRunner::class)
@AutoConfigureMockMvc
@SpringBootTest(classes = [mainPR2::class])
class mainPR2Test {

    @Autowired
    private val mvc: MockMvc? = null

    private val texto_ingles: String = "Hello,translate me!"
    private val texto_espaniol: String = "Hola,traduceme!"
    private val default_message: String = "Im just a dummy translator, I cant translate anything else"
    private val random_text: String = "Hola don pepito"

    @Test
    fun translateFromSpanishToEnglish() {


        val jsonObject_request = JSONObject()
        jsonObject_request.put("query", "{TranslationRequest(langFrom: "+ "\"esp\"" +", langTo: "+ "\"en\"" + " text:" + "\"$texto_espaniol\")"  +
                "{translation}" +
                "}")

        System.out.println(jsonObject_request.toString())

        val result = mvc!!.perform(MockMvcRequestBuilders.post("/graphql")
                .content(jsonObject_request.toString())
                .contentType("application/json;UTF-8")
                .accept(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.request().asyncStarted())
                .andReturn()

        mvc.perform(MockMvcRequestBuilders.asyncDispatch(result))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.TranslationRequest.translation",
                        Matchers.`is`(texto_ingles)))
    }

    @Test
    fun TranslateFromEnglishToSpanish () {
        val jsonObject_request = JSONObject()
        jsonObject_request.put("query", "{TranslationRequest(langFrom: "+ "\"en\"" +", langTo: "+ "\"esp\"" + " text:" + "\"$texto_ingles\")"  +
                "{translation}" +
                "}")

        System.out.println(jsonObject_request.toString())

        val result = mvc!!.perform(MockMvcRequestBuilders.post("/graphql")
                .content(jsonObject_request.toString())
                .contentType("application/json;UTF-8")
                .accept(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.request().asyncStarted())
                .andReturn()

        mvc.perform(MockMvcRequestBuilders.asyncDispatch(result))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.TranslationRequest.translation",
                        Matchers.`is`(texto_espaniol)))
    }

    @Test
    fun TranslateUnknownLanguaje () {
        val jsonObject_request = JSONObject()
        jsonObject_request.put("query", "{TranslationRequest(langFrom: "+ "\"en\"" +", langTo: "+ "\"fr\"" + " text:" + "\"$texto_ingles\")"  +
                "{translation}" +
                "}")

        System.out.println(jsonObject_request.toString())

        val result = mvc!!.perform(MockMvcRequestBuilders.post("/graphql")
                .content(jsonObject_request.toString())
                .contentType("application/json;UTF-8")
                .accept(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.request().asyncStarted())
                .andReturn()

        mvc.perform(MockMvcRequestBuilders.asyncDispatch(result))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.TranslationRequest.translation",
                        Matchers.`is`(default_message)))
    }

    @Test
    fun TranslateUnknownText () {
        val jsonObject_request = JSONObject()
        jsonObject_request.put("query", "{TranslationRequest(langFrom: "+ "\"en\"" +", langTo: "+ "\"esp\"" + " text:" + "\"$random_text\")"  +
                "{translation}" +
                "}")

        System.out.println(jsonObject_request.toString())

        val result = mvc!!.perform(MockMvcRequestBuilders.post("/graphql")
                .content(jsonObject_request.toString())
                .contentType("application/json;UTF-8")
                .accept(MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.request().asyncStarted())
                .andReturn()

        mvc.perform(MockMvcRequestBuilders.asyncDispatch(result))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.TranslationRequest.translation",
                        Matchers.`is`(default_message)))
    }

}