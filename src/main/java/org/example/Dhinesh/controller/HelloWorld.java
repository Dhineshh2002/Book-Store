package org.example.Dhinesh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping ("/hello")
    public String returnHelloWorld(){
        return "Hello World :)";
    }

}
