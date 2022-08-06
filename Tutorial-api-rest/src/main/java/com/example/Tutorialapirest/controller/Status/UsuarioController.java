package com.example.Tutorialapirest.controller.Status;

import com.example.Tutorialapirest.model.Usuariomodel;
import com.example.Tutorialapirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
        .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/usuario/salvar")
   public Usuariomodel salvar(@RequestBody Usuariomodel usuario){
        return repository.save(usuario);
    }
}
