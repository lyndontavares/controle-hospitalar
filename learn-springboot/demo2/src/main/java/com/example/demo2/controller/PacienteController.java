package com.example.demo2.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.domain.Medico;
import com.example.demo2.domain.Paciente;
import com.example.demo2.repository.MedicoRepository;
import com.example.demo2.repository.PacienteRepository;

 


@RestController
public class PacienteController {


    @Autowired
    private PacienteRepository repository;
    


    @GetMapping("/pacientes")
    public ResponseEntity<Iterable<Paciente>> getAll() {
    	
            Iterable<Paciente> medicos = repository.findAll();
                        
            return new ResponseEntity<>(medicos, HttpStatus.OK);
    }
    
    
    @PostMapping("/pacientes")
    ResponseEntity<Paciente> create( @RequestBody Paciente record) throws URISyntaxException {
    	
    	Paciente result = repository.save(record);
        return ResponseEntity.created(new URI("/medicos/" + result.getId())).body(result);
        
    }
        

    @DeleteMapping("/pacientes/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
    	
        repository.deleteById(id);
        return ResponseEntity.ok().build();
        
    }
    
    

}
