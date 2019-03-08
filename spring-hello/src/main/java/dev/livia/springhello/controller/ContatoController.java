package dev.livia.springhello.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.livia.springhello.model.Contato;
import dev.livia.springhello.repository.ContatoRepository;

@RestController
@RequestMapping({"/contatos"})
public class ContatoController {
	
	private ContatoRepository repository;

    ContatoController(ContatoRepository contactRepository) {
        this.repository = contactRepository;
    }

    @GetMapping
    public List findAll(){
        return repository.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Contato> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

}
