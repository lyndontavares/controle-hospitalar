package com.mycompany.hospital.web;

import com.mycompany.hospital.domain.Usuario;
import com.mycompany.hospital.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/usuarios")
    public Iterable<Usuario> home() {
        return repository.findAll();
    }
}
