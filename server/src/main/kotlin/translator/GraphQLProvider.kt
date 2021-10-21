package translator


import com.google.common.base.Charsets
import com.google.common.io.Resources
import org.springframework.beans.factory.annotation.Autowired
import graphql.GraphQL
import javax.annotation.PostConstruct
import kotlin.Throws
import java.io.IOException
import graphql.schema.GraphQLSchema
import graphql.schema.idl.SchemaParser
import graphql.schema.idl.RuntimeWiring
import graphql.schema.idl.SchemaGenerator
import graphql.schema.idl.TypeRuntimeWiring
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component


@Component
class GraphQLProvider {

    @Autowired
    var executor: GraphQLExecutor? = null

    private var graphQL: GraphQL? = null

    @PostConstruct
    @Throws(IOException::class)
    fun init() {
        val url = Resources.getResource("schema.graphqls")
        val sdl = Resources.toString(url, Charsets.UTF_8)
        val graphQLSchema = buildSchema(sdl)
        graphQL = GraphQL.newGraphQL(graphQLSchema).build()

    }

    private fun buildSchema(sdl: String): GraphQLSchema {
        val typeRegistry = SchemaParser().parse(sdl)
        val runtimeWiring = buildWiring()
        val schemaGenerator = SchemaGenerator()
        return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring)
    }

    private fun buildWiring(): RuntimeWiring {
        return RuntimeWiring.newRuntimeWiring()
                .type(TypeRuntimeWiring.newTypeWiring("Query")
                        .dataFetcher("TranslationRequest", executor!!.translationRequest()))
                .build()
    }

    @Bean
    fun graphQL(): GraphQL? {
        return graphQL
    }
}