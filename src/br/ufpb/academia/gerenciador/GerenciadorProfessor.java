/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpb.academia.gerenciador;


import br.ufpb.academia.model.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class GerenciadorProfessor {

    List<Professor> listaProfessores = new ArrayList<>();
    
    public void adcionarProfessor(Professor professor){
        listaProfessores.add(professor);
    }

    public List<Professor> listarProfessor() {
        return listaProfessores;
    }

    public Professor buscarProfessor(int matricula) {
        for (Professor professor : listaProfessores) {
            if (professor.getMatricula() == matricula) {
                return professor;
            }
        }

        return null;
    }

    public void removerProfessor(int matricula) {
        for (Professor professor : listaProfessores) {
            if (professor.getMatricula() == matricula) {
                return;
            }
        }

    }

    public void atualizarProfessor(Professor novoProfessor) {
        for (Professor professor : listaProfessores) {
            if (professor.getMatricula() == novoProfessor.getMatricula()) {
                professor.setNome(novoProfessor.getNome());
                professor.setEmail(novoProfessor.getEmail());
                professor.setCpf(novoProfessor.getCpf());
                professor.setTelefone(novoProfessor.getTelefone());
                professor.setEndereco(novoProfessor.getEndereco());
                professor.setSalario(novoProfessor.getSalario());
            }
        }

    }

}
