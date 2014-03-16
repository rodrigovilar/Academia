/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpb.academia.gerenciador;

import br.ufpb.academia.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {

	List<Aluno> listaAlunos = new ArrayList<>();

	public void adcionarAluno(Aluno aluno) {
		listaAlunos.add(aluno);
	}

	public List<Aluno> listarAlunos() {
		return listaAlunos;
	}

	public Aluno buscarAluno(int matricula) {
		for (Aluno aluno : listaAlunos) {
			if (aluno.getMatricula() == matricula) {
				return aluno;
			}
		}

		return null;
	}

	public void removerAluno(Aluno aluno) {
		listaAlunos.remove(aluno);
	}

	public int quantidadeDeAluno() {
		return listaAlunos.size();
	}

	public Aluno getAluno(int posicao) {
		return listaAlunos.get(posicao);
	}

	public void atualizarAluno(Object p1, Object p2) {
		for (int i = 0; i < this.listaAlunos.size(); i++) {
			if (this.listaAlunos.get(i).equals(p1)) {
				this.listaAlunos.set(i, (Aluno) p2);
			}
		}

	}

}