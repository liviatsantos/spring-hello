package dev.livia.springhello;

import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.livia.springhello.model.Contato;
import dev.livia.springhello.repository.ContatoRepository;

@SpringBootApplication
public class SpringHelloApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(ContatoRepository repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11).mapToObj(i -> new Contato(i, "Contato " + i, "contato" + i + "@email.com", "(31) 99111-1111"))
			.map(v -> repository.save(v))
			.forEach(System.out::println);
					
		};
	}

}
