# Web Engineering 2021-2022 / Lab2 RPC over HTTP


## Solution adopted ##

The first problem we encountered trying to build the project is the dependencies of the client,
it trys to get the file "translator.wsdl" from the HTTP server.
To avoid problems during compilation time, we have to build and boot the server before the client:

# First start the Server ##

Use `./gradlew :server:build` to build the server and `./gradlew :server:bootRun` to boot it.

# Start the Client after de Server ##

Use `./gradlew :client:build` to build the client and `./gradlew :client:bootRun` to boot it.

# Running the client ##

In execution time there´s a problem in the client side, when we try to get de server response we get
an error. This is due to the server doesn´t create a "translation" field in the response, that´s why the client
show an error when trying yo get this translation

## Modifing the Server.kt file ##

In order to fix the error showed above we have to modify the Server.kt file in order to create a "translation" field in
the Server response. By giving translation a value inside the response creation we avoid the error in the client:

                        @Endpoint
                        class TranslatorEndpoint {
                            @PayloadRoot(namespace = TRANSLATOR_NAMESPACE_URI, localPart = "TranslationRequest")
                            @ResponsePayload
                            fun translation(@RequestPayload request: TranslationRequest): TranslationResponse = 

                                TranslationResponse().apply {
                                      translation="!Traduceme !"    ## Giving translation a value ##
                                }
                        }
## Result ##

By doing this 2 changes we get an output like this in the client side:

    > Task :client:bootRun
    Result of translating [Translate me!] is [!Traduceme !]