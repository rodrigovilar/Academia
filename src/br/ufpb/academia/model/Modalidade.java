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
public class Modalidade {
    
    
    private String nome;
    private double valor;

  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Modalidade{" + "nome=" + nome + ", valor=" + valor + '}';
    }
    
    
}
