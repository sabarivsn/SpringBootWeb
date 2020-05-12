package com.poc.SpringBootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public Demo demo() {
        Demo d = new Demo();
        d.setMessage("Greetings");
        return d;
    }
}
