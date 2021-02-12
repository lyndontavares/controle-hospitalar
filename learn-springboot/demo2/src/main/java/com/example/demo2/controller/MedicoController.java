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
import com.example.demo2.repository.MedicoRepository;

 


@RestController
public class MedicoController {


    @Autowired
    private MedicoRepository repository;
    


    @GetMapping("/medicos")
    public ResponseEntity<Iterable<Medico>> getAll() {
    	
            Iterable<Medico> medicos = repository.findAll();
                        
            return new ResponseEntity<>(medicos, HttpStatus.OK);
    }
    
    
    @PostMapping("/medicos")
    ResponseEntity<Medico> create( @RequestBody Medico record) throws URISyntaxException {
    	
        Medico result = repository.save(record);
        return ResponseEntity.created(new URI("/medicos/" + result.getId())).body(result);
        
    }
        

    @DeleteMapping("/medicos/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
    	
        repository.deleteById(id);
        return ResponseEntity.ok().build();
        
    }
    
    

}
