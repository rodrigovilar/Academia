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
public class Aluno extends Pessoa{
    
    
    private  Modalidade modalidade;

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "Aluno{" + "modalidade=" + modalidade + '}' + super.toString(); 
    }
   
    
}
