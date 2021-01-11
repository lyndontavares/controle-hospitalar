package com.mycompany.hospital.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import com.mycompany.hospital.domain.Paciente;
import com.mycompany.hospital.repository.PacienteRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = { "http://localhost:8081" })
@RestController
public class PacienteController {

    private final Logger log = LoggerFactory.getLogger(MedicoController.class);

    @Autowired
    private PacienteRepository repository;

    @GetMapping("/pacientes")
    public Iterable<Paciente> getAll() {
        return repository.findAll();
    }

    @GetMapping("/pacientes/{id}")
    ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Paciente> record = repository.findById(id);
        return record.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/pacientes")
    ResponseEntity<Paciente> create(@RequestBody Paciente record) throws URISyntaxException {
        log.info("Request to create paciente: {}", record);
        Paciente result = repository.save(record);
        return ResponseEntity.created(new URI("/pacientes/" + result.getId())).body(result);
    }

    @PutMapping("/pacientes/{id}")
    ResponseEntity<Paciente> update(@RequestBody Paciente record) {
        log.info("Request to update paciente: {}", record);
        Paciente result = repository.save(record);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/pacientes/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        log.info("Request to delete paciente: {}", id);
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
