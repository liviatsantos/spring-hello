package dev.livia.springhello.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contato {

	  	@Id
	    @GeneratedValue
	    private Long id;

	    private String nome;
	    private String email;
	    private String fone;
}
