package com.empresa.crudcliente.dto;

import java.io.Serializable;
import java.time.Instant;

import com.empresa.crudcliente.entities.Client;

public class ClientDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String cpf;
	private double income;
	private Instant birthDate;
	private Integer children;
	
	public ClientDTO(){
		
	}
	
	public ClientDTO(Long id, String nome, String cpf, double income, Instant birthDate, Integer children) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}


	public ClientDTO(Client entity) {
		
		id = entity.getId();
		nome = entity.getNome();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
	
		
}

