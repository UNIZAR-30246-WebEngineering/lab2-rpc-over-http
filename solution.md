# Lab2-rpc-over-http 
## Web Engineering
### Guillermo Cánovas (755848)

The primary goal here is to discover how to run the `server` and the `client`. 

First of all we have to open one terminal so we can build and run the server so it starts listening and waiting for a client connection.
To build i´ve done `./gradlew :server:build` and to run it `./gradlew :server:bootRun`

Now we have to open another terminal where we are going to build and run the client so it can connects with the server.
The way to do it is exactly the same as before but this time using the word client: `./gradlew :client:build` and `./gradlew :client:bootRun`

Next we must ensure that the client shows something similar to:
```
Result of translating [hello] is [hola].
```

In order to get this result i´ve made some changes in the `Client.kt` and in `Server.kt`

#### Client.kt 
val input = "hello"

#### Server.kt
@ResponsePayload
    fun translation(@RequestPayload request: TranslationRequest): TranslationResponse = TranslationResponse().apply {
        translation = "hola"
    }


At this point, both server and client are running correctly and we are getting the expected result so it works!