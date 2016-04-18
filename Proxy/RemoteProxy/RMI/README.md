How to run the application?

SERVER
----------------------
1. javac *.java
2. rmic AppImpl
3. rmiregistry
   Note: you have to run "rmiregistry" inside the current folder
4. java Publisher

Client
----------------------
5. copy the files below to the client server
   - AppImpl_Stub.class
   - AppRemote.class
   - Client.class
6. java Client <SERVER_IP_ADDRESS>
