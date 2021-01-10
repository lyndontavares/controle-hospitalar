package com.mycompany.hospital.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;

import com.mycompany.hospital.domain.Medico;
import com.mycompany.hospital.repository.MedicoRepository;

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

@CrossOrigin(origins={"http://localhost:3000"})
@RestController("/api")
public class MedicoController {

    private final Logger log = LoggerFactory.getLogger(MedicoController.class);

    @Autowired
    private MedicoRepository repository;

    @GetMapping("/medicos")
    public Iterable<Medico> getAll() {
        return repository.findAll();
    }

    @GetMapping("/medicos/{id}")
    ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Medico> record = repository.findById(id);
        return record.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/medicos")
    ResponseEntity<Medico> create( @RequestBody Medico record) throws URISyntaxException {
        log.info("Request to create medicos: {}", record);
        Medico result = repository.save(record);
        return ResponseEntity.created(new URI("/medicos/" + result.getId()))
                .body(result);
    }

    @PutMapping("/medicos/{id}")
    ResponseEntity<Medico> update(@RequestBody Medico record) {
        log.info("Request to update medicos: {}", record);
        Medico result = repository.save(record);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/medicos/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        log.info("Request to delete medicos: {}", id);
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
