CREATE TABLE `agendamentos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_especialidade` bigint(20) NOT NULL ,
  `id_medico` bigint(20) NOT NULL ,
  `id_paciente` bigint(20) NOT NULL ,
  `id_horario` bigint(20) NOT NULL ,
  `data_consulta` datetime NOT NULL ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=UTF8MB4;
