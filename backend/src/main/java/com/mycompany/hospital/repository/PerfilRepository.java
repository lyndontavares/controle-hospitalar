package com.mycompany.hospital.repository;

import com.mycompany.hospital.domain.Perfil;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface PerfilRepository extends CrudRepository<Perfil, Long> {

}
