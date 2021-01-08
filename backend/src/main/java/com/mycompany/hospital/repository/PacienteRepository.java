package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.Paciente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface PacienteRepository extends CrudRepository<Paciente, Long> {

}
