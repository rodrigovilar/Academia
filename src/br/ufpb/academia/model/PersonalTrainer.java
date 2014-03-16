package br.ufpb.academia.model;

public class PersonalTrainer extends Pessoa{
	
	private String diaria;
    private String descricao;
    
	public String getDiaria() {
		return diaria;
	}
	
	public void setDiaria(String diaria) {
		this.diaria = diaria;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "PersonalTrainer [diaria=" + diaria + ", descricao="
				+ descricao + "]  " + super.toString() ;
	}
}
