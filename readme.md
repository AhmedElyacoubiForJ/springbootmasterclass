### Http reference documentation
*  [HTTP response status codes](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status)

### Spring Data reference documentation
*  [Spring Data](https://spring.io/projects/spring-data)

### Feign makes writing Java http clients easier
*  [OpenFeign](https://github.com/OpenFeign/feign/blob/master/README.md)

### Free fake API for testing and prototyping
*  [{JSON} Placeholder](https://jsonplaceholder.typicode.com/)

### Spring Cloud OpenFeign documentation
*  [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
*  (https://docs.spring.io/spring-cloud-openfeign/reference/4.1/spring-cloud-openfeign.html)

### Spring boot logging documentation
* [Spring Boot Logging](https://docs.spring.io/spring-boot/docs/2.1.13.RELEASE/reference/html/boot-features-logging.html)

### Spring Boot Actuator Web API Documentation
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/actuator-api/htmlsingle/)

### Micrometer documentation
*  [Micrometer](https://micrometer.io/)
*  [From metrics to insight](https://prometheus.io/)

How to build the project using cmd without installing maven
we use that one what from intellij
C:\Users\Ahmed\ay\code\springbootmasterclass>.\mvnw clean
C:\Users\Ahmed\ay\code\springbootmasterclass>.\mvnw clean install
C:\Users\Ahmed\ay\code\springbootmasterclass\target>
java -jar springbootmasterclass-0.0.1-SNAPSHOT.jar

running multiple application instances
C:\Users\Ahmed\ay\code\springbootmasterclass\target>
java -jar springbootmasterclass-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod --server.port=9090


