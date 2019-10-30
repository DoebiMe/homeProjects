package hello;

//https://spring.io/guides/gs/rest-service/
//https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
