package dev.livia.springhello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.livia.springhello.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato , Long>{

}
