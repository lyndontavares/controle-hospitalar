package com.mycompany.hospital.web;

import com.mycompany.hospital.domain.Paciente;
import com.mycompany.hospital.repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @GetMapping("/pacientes")
    public Iterable<Paciente> home() {
        return repository.findAll();
    }
}
