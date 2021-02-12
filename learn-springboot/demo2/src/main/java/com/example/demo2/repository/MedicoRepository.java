package com.example.demo2.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo2.domain.Medico;

@RepositoryRestResource
public interface MedicoRepository extends CrudRepository<Medico, Long> {

}
