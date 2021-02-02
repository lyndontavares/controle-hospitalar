package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.ExameProcedimento;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface ExameProcedimentoRepository extends CrudRepository<ExameProcedimento, Long> {

}
