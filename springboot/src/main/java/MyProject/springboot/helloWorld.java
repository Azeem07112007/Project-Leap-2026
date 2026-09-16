package MyProject.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/hello")
    String hello(){
        return "Hello World";
    }

    @GetMapping("/sum")
    int sum(){
        return 900;
    }
}
