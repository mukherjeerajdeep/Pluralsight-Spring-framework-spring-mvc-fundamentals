package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
// SpringBootServletInitializer will help to install the internal view resolver to pull up the changes
// from the jsp pages. Check the settings in the app.properties file.
// 		spring.mvc.view.prefix=/WEB-INF/jsp/ -- From Where should it pick-up
//		spring.mvc.view.suffix=.jsp -- What type of file/extension to pick-up
public class ConferenceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

}
