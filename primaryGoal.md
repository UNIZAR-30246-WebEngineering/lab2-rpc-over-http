Instructions of how to run the server and the client.

First we must launch the server, otherwise the client cannot be built.
I have use the same commands in order to build and deploy both of them, but first I have launch this command ./gradlew clean to solve an error that had appeared.


Server
./gradlew :server:build 
./gradlew :server:check 
./gradlew :server:bootRun

Client
./gradlew :client:build 
./gradlew :client:check 
./gradlew :client:bootRun

Since I didn't modify the server code it return an error. So I have implemented the missing code, which function is to specify the translation of the string received by the client. In my case that word is car.
After that the program works well.