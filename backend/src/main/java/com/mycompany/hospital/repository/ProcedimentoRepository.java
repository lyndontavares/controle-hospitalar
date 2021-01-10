package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.Procedimento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface ProcedimentoRepository extends CrudRepository<Procedimento, Long> {

}
