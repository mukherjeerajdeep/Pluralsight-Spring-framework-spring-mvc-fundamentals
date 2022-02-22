package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/*@RestController (@Controller + @ResponseBody)
* https://stackoverflow.com/questions/26549379/when-use-responseentityt-and-restcontroller-for-spring-restful-applications*/

@RestController
public class UserController {

    /* RestControllers doesn't need any view resolver as the Controller needs, RestControllers
    * Has their own view resolver to provide the JSON output to caller i.e. client. The view
    * resolver in normal Controller actually shows or views the JSP pages depending upon the
    * configuration class provides with @Configuration and @Bean properties */
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Bryan") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Hansen") String lastname,
                        @RequestParam(value = "age", defaultValue = "43") int age) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User firstname:" + user.getFirstname());

        return user;
    }

    @GetMapping("/user/firstname")
    public ResponseEntity<User> getUser(
            @RequestParam(value = "firstname", defaultValue = "Rajdeep") String firstname,
            HttpServletRequest request) {

        User user = new User();
//        System.out.println("Request received is: " + request);

//        HttpServletResponse response = new Response();
//        response.addHeader("Text","Test");

        HttpHeaders responseHeaders = new HttpHeaders();
        user.setFirstname(firstname);

        return new ResponseEntity<>(user, responseHeaders, HttpStatus.OK);
    }
}
