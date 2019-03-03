package dev.livia.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringHelloApplication {

	
	@RequestMapping("/")
	String home() {
		return "Hello livia.dev!";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}

}
