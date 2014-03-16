/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.ss
 */
package br.ufpb.academia.fachada;

import br.ufpb.academia.gerenciador.GerenciadorAluno;
import br.ufpb.academia.gerenciador.GerenciadorPersonalTrainer;
import br.ufpb.academia.gerenciador.GerenciadorProfessor;
import br.ufpb.academia.model.Aluno;
import br.ufpb.academia.model.PersonalTrainer;
import br.ufpb.academia.model.Professor;

public class FachadaAcademia {

	GerenciadorAluno gerenAluno;
	GerenciadorProfessor gerenProf;
	GerenciadorPersonalTrainer gerentePersonals;

	public FachadaAcademia() {

		gerenAluno = new GerenciadorAluno();
		gerenProf = new GerenciadorProfessor();
		gerentePersonals = new GerenciadorPersonalTrainer();
	}

	public void adcionarAluno(Aluno aluno) {
		gerenAluno.adcionarAluno(aluno);
	}

	public void removerAluno(Aluno aluno) {
		gerenAluno.removerAluno(aluno);
	}

	public void listarAluno() {
		gerenAluno.listarAlunos();
	}

	public int quantidadeDeAlunos() {
		return gerenAluno.quantidadeDeAluno();
	}

	public int quantidadeDeProfesores() {
		return gerenProf.quantidadeDeProfessor();
	}

	public Aluno buscarAluno(int matricula) {
		return gerenAluno.buscarAluno(matricula);
	}

	public void atualizarAluno(Object alunoAntigo, Object alunoNovo) {
		gerenAluno.atualizarAluno(alunoAntigo, alunoNovo);
	}

	public Aluno getAluno(int posicao) {
		return gerenAluno.getAluno(posicao);
	}

	public void adcionarProfessor(Professor professor) {
		gerenProf.adcionarProfessor(professor);
	}

	public void removerProfessor(Professor professor) {
		gerenProf.removerProfessor(professor);
	}

	public Professor buscarProfessor(int matricula) {
		return gerenProf.buscarProfessor(matricula);
	}

	public Professor getpProfessor(int posicao) {
		return gerenProf.getProfessor(posicao);
	}

	public void atualizarProfessor(Object profAntigo, Object profNovo) {
		gerenProf.atualizarProfessor(profAntigo, profNovo);
	}

	public void adcionarPersonal(PersonalTrainer personal) {
		gerentePersonals.adcionarPersonal(personal);
	}

	public void removerPersonal(PersonalTrainer personal) {
		gerentePersonals.removerPersonal(personal);
	}

	public int quantidadeDePersonals() {
		return gerentePersonals.quantidadeDePersonal();
	}

	public PersonalTrainer buscarPersonal(int matricula) {
		return gerentePersonals.buscarPersonal(matricula);
	}

	public PersonalTrainer getPersonal(int posicao) {
		return gerentePersonals.getPersonal(posicao);
	}

	public void atualizarPersonal(Object personalAntigo, Object personalNovo) {
		gerentePersonals.atualizarPersonal(personalAntigo, personalNovo);
	}
}
