package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.Medico;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface MedicoRepository extends CrudRepository<Medico, Long> {

}
