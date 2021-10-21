#How to deploy the system?

In order to run the server we have to do the following thing:

1.- First of all, we must ensure that we have gradle installed on our computer, in order to do this
we have to write 'gradle -v' on our terminal. If gradle is installed, then we can proceed, otherwise we should install it.

2.- We must build the server and then run it, lets see how to do that:
```
./gradlew :server:build    -> Compiles and builds the server
./gradlew :server:bootRun  -> Launches the server
```

Once we have done this, the server is already launched and ready to attend a client. To run a client we must do
the same thing we did to run the server:

```
./gradlew :client:build    
./gradlew :client:bootRun  
```
#Solving the practice

To solve this practice we must finish the method "translation" on server side

```
@PayloadRoot(namespace = TRANSLATOR_NAMESPACE_URI, localPart = "TranslationRequest")
@ResponsePayload
fun translation(@RequestPayload request: TranslationRequest): TranslationResponse = TODO()
```
The solution is pretty simple, we just have to send the translation back to the client with the message translated.

```
fun translation(@RequestPayload request: TranslationRequest): TranslationResponse =
TranslationResponse().apply{
    translation = "Tradúceme!"
}
```