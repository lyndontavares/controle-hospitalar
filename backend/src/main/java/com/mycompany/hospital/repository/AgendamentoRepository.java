package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.Agendamento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface AgendamentoRepository extends CrudRepository<Agendamento, Long> {

}
