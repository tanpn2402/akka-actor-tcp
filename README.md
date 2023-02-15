# akka-actor-tcp
Simple project to implement Akka Actors with TCP client-server

Import projects AkaTcp, AkaTcpServer and their launch configs to Eclipse.\
## 1. Akka TCP server
Run by `AkaTcpServer.launch`.\
Tcp server listens on port 8077 as default.\
All connections will be stored in listOfActor `Map<String, ActorRef> listOfActor` with key is `connection_name` + `connection_port`.\
Once server started, it will send to all available connections a message `Ping` each 2 seconds.

## 2. Akka TCP client
Run by `AkaTcp.launch`.\
Once client started, it will connection to TCP server (on port 8077) and send a message `TcpSimpleMsg` to server each 2 seconds.
