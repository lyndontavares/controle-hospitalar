
INSERT INTO especialidades ( descricao,titulo) values ('Dermatologia','Dermatologia');
INSERT INTO especialidades ( descricao,titulo) values ('Epidemiologia','Epidemiologia');
INSERT INTO especialidades ( descricao,titulo) values ('Gastroenterologia','Gastroenterologia');
INSERT INTO especialidades ( descricao,titulo) values ('Medicina Esportiva','Medicina Esportiva');
INSERT INTO especialidades ( descricao,titulo) values ('Oftalmologia','Oftalmologia');
INSERT INTO especialidades ( descricao,titulo) values ('Oncologia','Oncologia');
INSERT INTO especialidades ( descricao,titulo) values ('Radiologia','Radiologia');

INSERT INTO usuarios (email,senha,ativo) VALUES ( 'pacienteA@gmail.com','123',1);
INSERT INTO usuarios (email,senha,ativo) VALUES ('pacienteB@gmail.com','123',1);
INSERT INTO usuarios (email,senha,ativo) VALUES ('medicoA@gmail.com','123',1);
INSERT INTO usuarios (email,senha,ativo) VALUES ('medicoB@gmail.com','123',1);

INSERT INTO perfis (descricao) VALUES ('PACIENTE');
INSERT INTO perfis (descricao) VALUES ('MEDICO');

INSERT INTO usuarios_tem_perfis (id_usuario,id_perfil) VALUES (1,1);
INSERT INTO usuarios_tem_perfis (id_usuario,id_perfil) VALUES (2,1);
INSERT INTO usuarios_tem_perfis (id_usuario,id_perfil) VALUES (3,2);
INSERT INTO usuarios_tem_perfis (id_usuario,id_perfil) VALUES (4,2);

INSERT INTO pacientes (nome,endereco,telefone,sexo,data_nascimento,id_usuario) VALUES ('Paciente A','Endereco A','(45)9999-9990','M','2000-01-01',1);
INSERT INTO pacientes (nome,endereco,telefone,sexo,data_nascimento,id_usuario) VALUES ('Paciente B','Endereco B','(45)9999-9991','M','2001-01-01',1);

INSERT INTO medicos (nome,crm,endereco,telefone,sexo,data_inscricao,id_usuario) VALUES ('Medico A',111111,'Endereco A','(45)9999-9990','M','2000-01-01',1);
INSERT INTO medicos (nome,crm,endereco,telefone,sexo,data_inscricao,id_usuario) VALUES ('Medico B',222222,'Endereco B','(45)9999-9991','M','2001-01-01',1);

INSERT INTO horas (hora_minuto) VALUES ('08:00');
INSERT INTO horas (hora_minuto) VALUES ('08:30');
INSERT INTO horas (hora_minuto) VALUES ('09:00');
INSERT INTO horas (hora_minuto) VALUES ('09:30');
INSERT INTO horas (hora_minuto) VALUES ('10:00');
INSERT INTO horas (hora_minuto) VALUES ('10:30');
INSERT INTO horas (hora_minuto) VALUES ('11:00');
INSERT INTO horas (hora_minuto) VALUES ('11:30');
INSERT INTO horas (hora_minuto) VALUES ('14:00');
INSERT INTO horas (hora_minuto) VALUES ('14:30');
INSERT INTO horas (hora_minuto) VALUES ('15:00');
INSERT INTO horas (hora_minuto) VALUES ('16:00');
INSERT INTO horas (hora_minuto) VALUES ('16:30');
INSERT INTO horas (hora_minuto) VALUES ('17:00');
INSERT INTO horas (hora_minuto) VALUES ('17:30');

INSERT INTO procedimentos (descricao,custo) VALUES ('ARTERIOGRAFIA VERTEBRAL - UNILATERAL',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('ARTROCENTESE SELETIVA PARA SINOVIANÁLISE',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('ASSISTÊNCIA AO RECÉM-NASCIDO (PARTO NORMAL OU CESÁREO) - ATÉ 3 DIAS',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('BIÓPSIA COM AGULHA',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('BIÓPSIA DE PELE ',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('CONSULTÓRIO (HORÁRIO NORMAL OU PRÉ-ESTABELECIDO)',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('DIÁLISE PERITONIAL (POR SESSÃO) ',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('HEMODIÁLISE CONTÍNUA (12H)',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('IMPLANTE DE CATETER PERITONEAL',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('INFILTRAÇÃO OU PUNÇÃO ARTICULAR',100);
INSERT INTO procedimentos (descricao,custo) VALUES ('VISITA HOSPITALAR (PACIENTE INTERNADO) ',100);

INSERT INTO agendamentos (data_consulta,id_horario,id_paciente,id_medico,id_especialidade,custo) VALUES ('2021-01-01',1,1,1,1,100);
INSERT INTO agendamentos (data_consulta,id_horario,id_paciente,id_medico,id_especialidade,custo) VALUES ('2021-01-01',2,2,2,2,100);
INSERT INTO agendamentos (data_consulta,id_horario,id_paciente,id_medico,id_especialidade,custo) VALUES ('2021-02-01',1,1,1,1,100);
INSERT INTO agendamentos (data_consulta,id_horario,id_paciente,id_medico,id_especialidade,custo) VALUES ('2021-02-01',2,2,2,2,100);

INSERT INTO exames (data_consulta,id_horario,id_paciente,id_medico) VALUES ('2021-01-01',1,1,1);
INSERT INTO exames (data_consulta,id_horario,id_paciente,id_medico) VALUES ('2021-01-01',2,2,2);
INSERT INTO exames (data_consulta,id_horario,id_paciente,id_medico) VALUES ('2021-02-01',1,1,1);
INSERT INTO exames (data_consulta,id_horario,id_paciente,id_medico) VALUES ('2021-02-01',2,2,2);

INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-10',1,1,1,100);
INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-11',1,1,2,100);
INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-12',1,1,3,100);
INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-13',1,1,4,100);

INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-10',1,2,5,100);
INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-11',1,2,6,100);
INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-12',1,2,7,100);
INSERT INTO exame_procedimentos (data_consulta,id_horario,id_exame,id_procedimento,custo) VALUES ('2021-01-13',1,2,8,100);
