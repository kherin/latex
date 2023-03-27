package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);


    @GetMapping("/hello")
    public String hello() {
        logger.debug("Hello");
        return "Hello, world!";
    }
}
