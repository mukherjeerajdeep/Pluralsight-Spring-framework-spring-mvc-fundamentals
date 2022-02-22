package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    /*
    1. The view is resolved by the SpringBootApplication with a DispatcherServlet
    when the application calls for the SpringBootServletInitializer during the app run
    hence all the magic happen behind is due to this servlet
    2. Code implemented in the index.html pulls up the jsp pages during the view resolving.
    3. The paths mentioned in app.properties are also important here to locate the jsp files.
    3. @ModelAttribute is actually helping to map the model from the POJO and servlet displays
    them.
    */

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration")Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute ("registration")Registration registration) {
        System.out.println("Registration: " + registration.getName());
        return "registration";
    }

}
