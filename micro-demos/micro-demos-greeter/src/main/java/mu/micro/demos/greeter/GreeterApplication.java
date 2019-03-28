package mu.micro.demos.greeter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class GreeterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreeterApplication.class, args);
    }

}
