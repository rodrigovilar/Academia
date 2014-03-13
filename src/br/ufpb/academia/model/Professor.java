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
public class Professor extends Pessoa{
    
    
    private String cpf;
    private String salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "cpf=" + cpf + ", salario=" + salario + '}' + super.toString();
    }

   

   
    
    
    
}
