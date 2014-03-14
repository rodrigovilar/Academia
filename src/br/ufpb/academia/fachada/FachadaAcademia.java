/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.ss
 */
package br.ufpb.academia.fachada;

import br.ufpb.academia.gerenciador.GerenciadorAluno;
import br.ufpb.academia.gerenciador.GerenciadorProfessor;
import br.ufpb.academia.model.Aluno;
import br.ufpb.academia.model.Professor;

/**
 *
 * @author 
 */
public class FachadaAcademia {
    
    GerenciadorAluno gerenAluno;
    GerenciadorProfessor gerenProf;
    
    public FachadaAcademia() {
        gerenAluno = new GerenciadorAluno();
        gerenProf = new GerenciadorProfessor();
    }
    
    public void adcionarAluno(Aluno aluno) {
        gerenAluno.adcionarAluno(aluno);
    }
    
    public void removerAluno(int matricula) {
        gerenAluno.removerAluno(matricula);
    }
    
    public void listarAluno() {
        gerenAluno.listarAlunos();
    }
    
    public int quantidadeDeAlunos(){
    	 return gerenAluno.quantidadeDeAluno();
    }
    
    public int quantidadeDeProfesores(){
   	 return gerenProf.quantidadeDeProfessor();
   }
   
    public Aluno buscarAluno(int matricula) {
      return  gerenAluno.buscarAluno(matricula);
    }
    
    public void atualizarALuno(Aluno aluno) {
        gerenAluno.atualizarAluno(aluno);
    }
    
    public void adcionarProfessor(Professor professor) {
        gerenProf.adcionarProfessor(professor);
    }
    
    public void removerProfessor(int matricula) {
        gerenProf.removerProfessor(matricula);
    }
    
    public void listarProfessor() {
        gerenProf.listarProfessor();
    }

    public Professor buscarProfessor(int matricula) {
       return gerenProf.buscarProfessor(matricula);
    }

    public void atualizarProfessor(Professor professor) {
        gerenProf.atualizarProfessor(professor);
    }
}
