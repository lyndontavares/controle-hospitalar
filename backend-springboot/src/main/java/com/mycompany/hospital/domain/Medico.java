package com.mycompany.hospital.domain;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "medicos", indexes = {
	 @Index(name = "idx_medicos_nome", columnList = "nome", unique = true) ,
     @Index(name = "idx_medicos_crm", columnList = "crm", unique = true)
})
public class Medico extends AbstractEntity {

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "crm", nullable = false)
	private Integer crm;

	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_inscricao", nullable = false)
	private LocalDate dtInscricao;

	@Column(name = "endereco", nullable = true)
	private String endereco;

	@Column(name = "telefone", nullable = true)
	private String telefone;

	@Column(name = "sexo", nullable = true)
	private String sexo;

	// evita recursividade quando o json de resposta for criado para a datatables.
	@JsonIgnore
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "medicos_tem_especialidades",
			joinColumns = @JoinColumn(name = "id_medico", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "id_especialidade", referencedColumnName = "id")
    )
	private Set<Especialidade> especialidades;

	// evita recursividade quando o json de resposta for criado para a datatables.
	@JsonIgnore
	@OneToMany(mappedBy = "medico")
	private List<Agendamento> agendamentos;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Medico() {
		super();
	}

	public Medico(Long id) {
		super.setId(id);
	}

	public Medico(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	public LocalDate getDtInscricao() {
		return dtInscricao;
	}

	public void setDtInscricao(LocalDate dtInscricao) {
		this.dtInscricao = dtInscricao;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Set<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Set<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
