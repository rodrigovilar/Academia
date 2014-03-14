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
		Aluno aluno2 = criarAlunoNovamente();
		assertEquals(aluno, aluno2);
	}
	
	
	@Test
	public void removerAluno() {

		Aluno aluno = criarUmAluno();
		academia.removerAluno(1);
		assertEquals(null, academia.buscarAluno(1));
	}

	public Aluno criarUmAluno() {

		Aluno aluno = new Aluno();
		Endereco end = new Endereco();
		Modalidade modalidade = new Modalidade();
		aluno.setNome("Heitor");
		aluno.setEmail("heitor@gmail.com");
		aluno.setMatricula(1);
		aluno.setTelefone("2356450");
		modalidade.setNome("muscula��o");
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

	public Aluno criarAlunoNovamente() {

		Aluno aluno2 = new Aluno();
		Endereco end2 = new Endereco();
		Modalidade modalidade2 = new Modalidade();

		aluno2.setNome("Heitor");
		aluno2.setEmail("heitor@gmail.com");
		aluno2.setMatricula(1);
		aluno2.setTelefone("2356450");
		modalidade2.setNome("muscula��o");
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
	
	public Aluno criarAlunoDiferente() {

		Aluno aluno3 = new Aluno();
		Endereco end3 = new Endereco();
		Modalidade modalidade3 = new Modalidade();

		aluno3.setNome("mailton");
		aluno3.setEmail("mailton.fernandes@dce.ufpb.br");
		aluno3.setMatricula(3);
		aluno3.setTelefone("123456");
		modalidade3.setNome("nata��o");
		modalidade3.setValor(50);
		end3.setRua("Rua A");
		end3.setNumero("33");
		end3.setComplemento("casa");
		end3.setBairro("Centro");
		end3.setCidade("Mamanguape");
		end3.setEstado("PB");
		aluno3.setEndereco(end3);
		aluno3.setModalidade(modalidade3);
		academia.adcionarAluno(aluno3);
		return aluno3;
	}

}
