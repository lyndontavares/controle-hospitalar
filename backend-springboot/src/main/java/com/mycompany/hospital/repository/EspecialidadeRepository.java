package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.Especialidade;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface EspecialidadeRepository extends CrudRepository<Especialidade, Long> {

}
