/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpb.academia.gerenciador;

import br.ufpb.academia.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class GerenciadorAluno {

    List<Aluno> listaAlunos = new ArrayList<>();

    public void adcionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        listaAlunos.remove(aluno);
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

    public void removerAluno(int matricula) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula() == matricula) {
                listaAlunos.remove(aluno);
                return;
            }
        }

    }
    
    public void atualizarAluno(Aluno novoAluno){
         for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula() == novoAluno.getMatricula()) {
                aluno.setNome(novoAluno.getNome());
                aluno.setEmail(novoAluno.getEmail());
                aluno.setModalidade(novoAluno.getModalidade());
                aluno.setTelefone(novoAluno.getTelefone());
                aluno.setEndereco(novoAluno.getEndereco());
            }
        }
    }

}