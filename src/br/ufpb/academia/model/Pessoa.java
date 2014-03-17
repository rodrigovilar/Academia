/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufpb.academia.model;

/**
 * 
 * @author
 */
public class Pessoa {

	private String matricula;
	private String nome;
	private String telefone;
	private Endereco endereco;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Pessoa{" + "matricula=" + matricula + ", nome=" + nome
				+ ", telefone=" + telefone + ", endereco=" + endereco
				+ ", email=" + email + '}';
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		
		final Pessoa other = (Pessoa) obj;
		
		if (this.matricula != other.matricula) {
			return false;
		}
		
		return true;
	}

}
