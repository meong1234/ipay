 # IPAY
 
IPAY is a sample grpc app consists of 4 different module
  - IPAY-API 
    - API for storing proto contract and to have auto generate to java and golang 
  - IPAY-Client
    - Java client for IPAY, all complexity to setup client here, such a NameResolver and Loadbalancer
  - IPAY-Server
    - A IPAY server implemented in GRPC
    
  - IPAY-SAMPLE-Client
    - just sample project how to use IPAY-Client

  
 # How to use

 ### Dependencies
 ```
 brew cask install java
 ```

 ### How to build

 ```
 make build
 ```

 ### How to run a server
 ```
 make run-server
 ```
 
 ### How to run a sample client
 ```
 make run-client
 ```