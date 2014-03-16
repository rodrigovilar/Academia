/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpb.academia.gerenciador;

import br.ufpb.academia.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProfessor {

	List<Professor> listaProfessores = new ArrayList<>();

	public void adcionarProfessor(Professor professor) {
		listaProfessores.add(professor);
	}

	public Professor buscarProfessor(int matricula) {
		for (Professor professor : listaProfessores) {
			if (professor.getMatricula() == matricula) {
				return professor;
			}
		}

		return null;
	}

	public void removerProfessor(Professor professor) {
		listaProfessores.remove(professor);
	}

	public int quantidadeDeProfessor() {
		return listaProfessores.size();
	}

	public Professor getProfessor(int posicao) {
		return listaProfessores.get(posicao);
	}

	public void atualizarProfessor(Object p1, Object p2) {
		for (int i = 0; i < this.listaProfessores.size(); i++) {
			if (this.listaProfessores.get(i).equals(p1)) {
				this.listaProfessores.set(i, (Professor) p2);
			}
		}

	}

}
