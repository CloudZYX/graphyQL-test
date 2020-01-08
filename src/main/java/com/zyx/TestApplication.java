package com.zyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
    UserService service = new UserService();

    public static void main(String []args){
        SpringApplication.run(TestApplication.class,args);

    }

    @RequestMapping("/hello")
    public String HelloWorld(){
        return service.getUser().toString();
    }
}
