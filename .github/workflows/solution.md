## Solucion 

Execute the code:

The first step of the task is build and execute the code,for that you need to use these commands in the same folder where gradlew is:
```
./gradlew :server:bootRun
./gradlew :client:bootRun
```

When you execute the code you will notice there is a a function thats not implements,which is `translation` in the server side.You just need to complete with the following code.

```
fun translation(@RequestPayload request: TranslationRequest): TranslationResponse {
        val response = TranslationResponse().apply { translation = "Hola"
         }
         return response
    }
```
You can assign whatever value  you want to `translation` in this case is "Hola" to match the example in the Github.