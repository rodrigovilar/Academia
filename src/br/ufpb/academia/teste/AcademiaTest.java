package br.ufpb.academia.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.academia.fachada.FachadaAcademia;
import br.ufpb.academia.model.Aluno;
import br.ufpb.academia.model.Endereco;
import br.ufpb.academia.model.Modalidade;

public class AcademiaTest {
	
	private FachadaAcademia academia = new FachadaAcademia();
	
	@Test
	public void AdcionarAluno() {
		Aluno aluno = new Aluno();
		Endereco end = new Endereco();
		Modalidade modalidade = new Modalidade();
	    aluno.setNome("Heitor");
	    aluno.setEmail("heitor@gmail.com");
	    aluno.setMatricula(1);
	    aluno.setTelefone("2356450");
	    modalidade.setNome("musculação");
	    modalidade.setValor(70);
	    end.setRua("Otavio Felix");
	    end.setNumero("101");
	    end.setComplemento("Apt 103");
	    end.setBairro("jose americo de Almeida");
	    end.setCidade("Joao Pessoa");
	    end.setEstado("PB");
	    aluno.setEndereco(end);
	    aluno.setModalidade(modalidade);
	    academia.adcionarAluno(aluno);
	    
	    
	    
	    
	}
	
	

}
