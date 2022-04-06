# iom-order-rest-ms
This microservice is used to capture order details/status within POS system.

## Instructions to install this template
* Create Spring Boot project [here] (https://start.spring.io/)
* select gradle as build module
* select/fill dependencies and other options accordingly


## Major Framewors & Versions
* Java version jdk1.8.0_231
* Gradle version can be found [here](gradle/wrapper/gradle-wrapper.properties).
* Spring Boot version can be found [here](build.gradle) under `plugins` `id 'org.springframework.boot'`

## Recommended Knowledge
This application uses the following libraries. Knowledge of these
libraries is recommended prior to making changes in this repository.
* {Building Java Projects with Gradle](https://spring.io/guides/gs/gradle/)
* [JSON Patch in Spring REST APIs](https://www.baeldung.com/spring-rest-json-patch)
* ... TBD ...

## Running locally
To get started with local development, start with the instructions here:
Run the following commands to start this service in your local/IDE terminal
* `gradle clean build`
* `gradle clean bootrun` or run option in IDE
* Using Postman you should be able to access the service at http://localhost:8080/orders

## Config file creation in progress following these steps
`config/application.yaml` provides context configuration while running locally
([Spring Boot docs define this location](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config.files)). A sample configuration file can be found
in [config/application-sample.yaml](config/application-sample.yaml). See the Spring Boot
[documentation on externalized configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config)
for more information.