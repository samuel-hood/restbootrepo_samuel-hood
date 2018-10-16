package org.morehouse.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class RestappApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/restapp");
		SpringApplication.run(RestappApplication.class, args);
	}
}
