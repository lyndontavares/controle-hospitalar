package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoasController {

	@GetMapping(value = "ola")
	public String teste() {
		return "Olá Mundo";
	}
	
	@GetMapping(value = "isa")
	public String olaIsa() {
		return "Olá pessoal, Eu sou Isa dev FullStack!!!!";  
	}
	
	@GetMapping(value = "pessoas")
	public List<String> listaDePessoas() {
		return Arrays.asList("Carlos","José");  
	}
	
}
