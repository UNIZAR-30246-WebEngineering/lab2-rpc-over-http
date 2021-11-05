In order to execute the server and the client we have to execute the server first with
```
./gradlew :server:bootRun
```

This command allows us to compile and run the server. Then we do the same for the client
```
./gradlew :client:bootRun
```

The client execution shows that there is an error in the server. We have to look for client.kt file and
modify it by adding the missing code in TODO tag.
