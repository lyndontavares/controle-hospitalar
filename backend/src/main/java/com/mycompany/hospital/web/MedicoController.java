package com.mycompany.hospital.web;

import com.mycompany.hospital.domain.Medico;
import com.mycompany.hospital.repository.MedicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @GetMapping("/medicos")
    public Iterable<Medico> home() {
        return repository.findAll();
    }
}
