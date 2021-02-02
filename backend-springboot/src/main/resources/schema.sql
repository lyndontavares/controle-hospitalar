DROP TABLE IF EXISTS `agendamentos`;
DROP TABLE IF EXISTS `usuarios_tem_perfis`;
DROP TABLE IF EXISTS `exame_procedimentos`;
DROP TABLE IF EXISTS `medicos_tem_especialidades`;
DROP TABLE IF EXISTS `exames`;
DROP TABLE IF EXISTS `pacientes`;
DROP TABLE IF EXISTS `procedimentos`;
DROP TABLE IF EXISTS `horas`;
DROP TABLE IF EXISTS `especialidades`;
DROP TABLE IF EXISTS `medicos`;
DROP TABLE IF EXISTS `usuarios`;
DROP TABLE IF EXISTS `perfis`;


CREATE TABLE `usuarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ativo` tinyint(1) NOT NULL,
  `email` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_kfsp0s1tflm1cwlj8idhqsad0` (`email`),
  KEY `idx_usuario_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `pacientes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data_nascimento` date NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(100),
  `telefone` varchar(20),
  `sexo` varchar(1),
  `id_usuario` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_qoqloi1kdau6h27l7xndw6hv8` (`nome`),
  KEY `FK34je9ip2cpgvy3m4ove9lmmqk` (`id_usuario`),
  CONSTRAINT `FK34je9ip2cpgvy3m4ove9lmmqk` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `procedimentos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `custo` decimal(19,2) DEFAULT NULL,
  `descricao` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `horas` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `hora_minuto` time NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_tdc0heyq6kan0bs0f57i1ggbu` (`hora_minuto`),
  KEY `idx_hora_minuto` (`hora_minuto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `especialidades` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao` text,
  `titulo` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_especialidade_titulo` (`titulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `medicos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `crm` int NOT NULL,
  `data_inscricao` date NOT NULL,
  `nome` varchar(100) NOT NULL,
  `endereco` varchar(100),
  `telefone` varchar(20),
  `sexo` varchar(1),
  `id_usuario` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_medicos_crm` (`crm`),
  UNIQUE KEY `idx_medicos_nome` (`nome`),
  KEY `FKhei0g6fy15d5komevfsk1qepe` (`id_usuario`),
  CONSTRAINT `FKhei0g6fy15d5komevfsk1qepe` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `agendamentos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `custo` decimal(19,2) DEFAULT NULL,
  `data_consulta` date DEFAULT NULL,
  `id_especialidade` bigint DEFAULT NULL,
  `id_horario` bigint DEFAULT NULL,
  `id_medico` bigint DEFAULT NULL,
  `id_paciente` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_agend_especialidade` (`id_especialidade`),
  KEY `idx_agend_medico` (`id_medico`),
  KEY `idx_agend_paciente` (`id_paciente`),
  KEY `idx_agend_horario` (`id_horario`),
  CONSTRAINT `FK70w3x8i8mc0ys8k47unu2jb9d` FOREIGN KEY (`id_medico`) REFERENCES `medicos` (`id`),
  CONSTRAINT `FKjhihg6sao9p1o3motjb0np9le` FOREIGN KEY (`id_especialidade`) REFERENCES `especialidades` (`id`),
  CONSTRAINT `FKlclwrj7i8bkger1cww58bj8wf` FOREIGN KEY (`id_horario`) REFERENCES `horas` (`id`),
  CONSTRAINT `FKto8l4lwoob2ebmvhvlg0d3t1d` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `exames` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data_consulta` date DEFAULT NULL,
  `id_horario` bigint DEFAULT NULL,
  `id_medico` bigint DEFAULT NULL,
  `id_paciente` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqctt01wulcurvauofwfxg2mj3` (`id_horario`),
  KEY `FKi108113i87lhh6602bacrvl86` (`id_medico`),
  KEY `FK6dibkl24ju5ifdtw1kwfh42q8` (`id_paciente`),
  CONSTRAINT `FK6dibkl24ju5ifdtw1kwfh42q8` FOREIGN KEY (`id_paciente`) REFERENCES `pacientes` (`id`),
  CONSTRAINT `FKi108113i87lhh6602bacrvl86` FOREIGN KEY (`id_medico`) REFERENCES `medicos` (`id`),
  CONSTRAINT `FKqctt01wulcurvauofwfxg2mj3` FOREIGN KEY (`id_horario`) REFERENCES `horas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `perfis` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_46fwiur1v4jn08eg093a3bckv` (`descricao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `usuarios_tem_perfis` (
  `id_usuario` bigint NOT NULL,
  `id_perfil` bigint NOT NULL,
  KEY `FKk1ij0ydx18kjc3ux501je1jyo` (`id_perfil`),
  KEY `FKgd2ai0c7adocm00e7qjr8stku` (`id_usuario`),
  CONSTRAINT `FKgd2ai0c7adocm00e7qjr8stku` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `FKk1ij0ydx18kjc3ux501je1jyo` FOREIGN KEY (`id_perfil`) REFERENCES `perfis` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `exame_procedimentos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `custo` decimal(19,2) DEFAULT NULL,
  `data_consulta` date DEFAULT NULL,
  `id_exame` bigint DEFAULT NULL,
  `id_horario` bigint DEFAULT NULL,
  `id_procedimento` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKf51gwoejqueuuj6diu1bb5nfd` (`id_exame`),
  KEY `FK4a0qrhasqmwi09moossw4aphb` (`id_horario`),
  KEY `FKbapr1cap0705o3ron4cislrms` (`id_procedimento`),
  CONSTRAINT `FK4a0qrhasqmwi09moossw4aphb` FOREIGN KEY (`id_horario`) REFERENCES `horas` (`id`),
  CONSTRAINT `FKbapr1cap0705o3ron4cislrms` FOREIGN KEY (`id_procedimento`) REFERENCES `procedimentos` (`id`),
  CONSTRAINT `FKf51gwoejqueuuj6diu1bb5nfd` FOREIGN KEY (`id_exame`) REFERENCES `exames` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `medicos_tem_especialidades` (
  `id_medico` bigint NOT NULL,
  `id_especialidade` bigint NOT NULL,
  PRIMARY KEY (`id_medico`,`id_especialidade`),
  KEY `FKsqgjqveg6ipicklj9ejaeknmr` (`id_especialidade`),
  CONSTRAINT `FK3t0i9oahaf4xg18s2ijyjeo5b` FOREIGN KEY (`id_medico`) REFERENCES `medicos` (`id`),
  CONSTRAINT `FKsqgjqveg6ipicklj9ejaeknmr` FOREIGN KEY (`id_especialidade`) REFERENCES `especialidades` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
