package com.example.Tutorialapirest.repository;

import com.example.Tutorialapirest.model.Usuariomodel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuariomodel, Integer> {
}
