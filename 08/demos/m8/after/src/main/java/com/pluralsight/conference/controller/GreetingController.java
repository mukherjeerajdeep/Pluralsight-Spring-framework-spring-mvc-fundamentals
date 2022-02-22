package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

/*    @GetMapping("greeting")
    public String greeting (Map<String, Object> model) {
        model.put("message", "Hello Bryan");
        return "greeting";
    }*/

    /* Changes done in here, earlier we are opening the something.jsp page, but now
       we will open the thyme.html page, the routing being done in the configuration class */
    @GetMapping("thyme")
    public String thyme (Map<String, Object> model) {
        model.put("message", "Hello Thymeleaf");
        return "thyme";
    }
}
