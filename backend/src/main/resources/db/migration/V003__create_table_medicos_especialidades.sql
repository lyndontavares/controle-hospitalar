CREATE TABLE `medicos_tem_especialidades` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_medico` bigint(20) NOT NULL,
  `id_especialidade`  bigint(20) NOT NULL ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=UTF8MB4;
