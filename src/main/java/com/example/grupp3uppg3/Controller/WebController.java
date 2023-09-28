package com.example.grupp3uppg3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    /* I denna metod tas ett namn in som en PathVariable och metoden returnerar
    då en hälsning och det namn som användaren angett
    */

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello, " + name;
    }

}
