Kotlin + Mockito + Weld
========================

* Run the dummy tests and build the app
    * `mvn clean package`

* Deploy the build to a wildfly server
A new server will be automatically downloaded but if you have one already, 
modify the plugin configuration in the POM (a comment has been added appropriately)

    * `mvn wildfly:run`
    
* Test the published endpoint
    * `curl http://localhost:8080/KWD/rpc/endpoint/java`
    * `curl http://localhost:8080/KWD/rpc/endpoint/kotlin`
    
* The interesting classes to look at are `DemoJava`, `DemoKotlin` and their tests.