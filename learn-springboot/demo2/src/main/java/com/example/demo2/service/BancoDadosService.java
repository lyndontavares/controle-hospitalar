package com.example.demo2.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.domain.Medico;
import com.example.demo2.domain.Paciente;
import com.example.demo2.repository.MedicoRepository;
import com.example.demo2.repository.PacienteRepository;

@Service
public class BancoDadosService {

	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	public void inicializarBanco() {
 
			for (int i = 1; i <= 10; i++) {
				
				Medico m = new Medico();
				
				m.setCrm(i);
				m.setDtInscricao(LocalDate.now());
				m.setEndereco("Endereco "+i);
				m.setNome("ISA "+i);
				m.setSexo("M");
				m.setTelefone("45 999999"+i);
				
				medicoRepository.save(m);
				
			}
			
			for (int i = 1; i <= 10; i++) {
				
				Paciente m = new Paciente();
				m.setNome("LYNDON "+i);
				pacienteRepository.save(m);
				
			}
	 
		
	}
	
	
}
