package com.example.demo2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo2.service.BancoDadosService;

@SpringBootApplication
public class Demo2Application {
	
	@Autowired
	BancoDadosService bancoService;

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@PostConstruct
	void init() {
		bancoService.inicializarBanco();
	}
	
}
