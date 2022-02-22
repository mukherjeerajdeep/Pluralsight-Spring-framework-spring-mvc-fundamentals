package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    /* Please check the File -> Settings -> App servers and the Apache
    Configuration are imported, also in POM.xml we need to change the packaging
    type to "WAR" instead of "JAR" as this is going to be a Web-App with *.jsp
    */
    @GetMapping("greeting")
    public String greeting (Map<String, Object> model) {
        model.put("message", "Hello Bryan");
        return "greeting";
    }
    /* Standard Web-App are not started from the src/main/resources/static rather
    they start from the webapp directory
    */

    /* Once the controller is loaded then it takes the input as we inserted in the map,
    then look for WEB-INF if there is any match with "greeting.jsp" because that is what
    we mentioned in the app.properties. If the match found then load the jsp rendering the
    message which is "Hello Bryan" in this case.
    */

}

