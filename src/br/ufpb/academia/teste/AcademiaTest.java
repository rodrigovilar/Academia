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
		
		Aluno aluno = criarUmAluno();
		Aluno aluno2 = CriarAlunoNovamente();
	    assertEquals(aluno,aluno2);  
	}
	
	
	

	public Aluno criarUmAluno(){
		
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
	    return aluno;
	}
	
	public Aluno CriarAlunoNovamente(){
		
		Aluno aluno2 = new Aluno();
		Endereco end2 = new Endereco();
		Modalidade modalidade2 = new Modalidade();
		
		aluno2.setNome("Heitor");
	    aluno2.setEmail("heitor@gmail.com");
	    aluno2.setMatricula(1);
	    aluno2.setTelefone("2356450");
	    modalidade2.setNome("musculação");
	    modalidade2.setValor(70);
	    end2.setRua("Otavio Felix");
	    end2.setNumero("101");
	    end2.setComplemento("Apt 103");
	    end2.setBairro("jose americo de Almeida");
	    end2.setCidade("Joao Pessoa");
	    end2.setEstado("PB");
	    aluno2.setEndereco(end2);
	    aluno2.setModalidade(modalidade2);
	    academia.adcionarAluno(aluno2);
	    return aluno2;
	}
	

}
