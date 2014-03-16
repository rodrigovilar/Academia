package br.ufpb.academia.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.academia.model.*;
import br.ufpb.academia.fachada.FachadaAcademia;
import br.ufpb.academia.model.Aluno;
import br.ufpb.academia.model.Endereco;
import br.ufpb.academia.model.Modalidade;

public class AcademiaTest {

	private FachadaAcademia academia = new FachadaAcademia();

	@Test
	public void adicionarAluno() {

		Aluno aluno = criarAluno();
		academia.adcionarAluno(aluno);
		Aluno aux = academia.getAluno(0); // comparando com o aluno na posi��o 0
											// da lista

		assertEquals(aluno, aux);
	}

	@Test
	public void removerAluno() {

		Aluno aluno = criarAluno();
		academia.adcionarAluno(aluno);
		academia.removerAluno(aluno);

		assertEquals(0, academia.quantidadeDeAlunos());
	}

	@Test
	public void adicionarAlunoDiferente() {

		Aluno aluno = criarAluno();
		academia.adcionarAluno(aluno);
		aluno = criarAlunoAuxiliar();
		academia.adcionarAluno(aluno);
		Aluno aux = academia.getAluno(1);
		assertEquals(aluno, aux);
	}

	@Test
	public void quantidadeDeAlunos() {

		Aluno aluno = criarAluno();
		academia.adcionarAluno(aluno);
		;
		Aluno aluno2 = criarAlunoAuxiliar();
		academia.adcionarAluno(aluno2);

		assertEquals(2, academia.quantidadeDeAlunos());
	}

	@Test
	public void atualizarAluno() {

		Aluno aluno1 = criarAluno();
		academia.adcionarAluno(aluno1); // add na posicao 0 da lista
		Aluno aluno2 = criarAlunoAuxiliar();
		academia.atualizarAluno(aluno1, aluno2); // trocando o aluno da posicao
													// 0 pela posicao 1
		assertEquals(aluno2, academia.getAluno(0)); // comparando o aluno2 com a
													// posicao 0 da lista
	}

	@Test
	public void adicionarProfessor() {

		Professor professor = criarProfessor();
		academia.adcionarProfessor(professor);
		Professor aux = academia.getpProfessor(0);
		assertEquals(professor, aux);
	}

	@Test
	public void removerProfessor() {

		Professor professor = criarProfessor();
		academia.adcionarProfessor(professor);
		academia.removerProfessor(professor);
		assertEquals(0, academia.quantidadeDeProfesores());
	}

	@Test
	public void adicionarProfessorDiferente() {

		Professor professor = criarProfessor();
		academia.adcionarProfessor(professor);
		;
		professor = criarProfessorAuxiliar();
		academia.adcionarProfessor(professor);
		;
		Professor aux = academia.getpProfessor(1);
		assertEquals(professor, aux);
	}

	@Test
	public void quantidadeDeProfessor() {

		Professor professor = criarProfessor();
		academia.adcionarProfessor(professor);
		;
		Professor professor2 = criarProfessorAuxiliar();
		academia.adcionarProfessor(professor2);
		assertEquals(2, academia.quantidadeDeProfesores());
	}

	@Test
	public void atualizarProfessor() {

		Professor professor1 = criarProfessor();
		academia.adcionarProfessor(professor1);
		Professor professor2 = criarProfessorAuxiliar();
		academia.atualizarProfessor(professor1, professor2);
		assertEquals(professor2, academia.getpProfessor(0));
	}

	@Test
	public void adicionarPersonal() {

		PersonalTrainer personal = criarPersonal();
		academia.adcionarPersonal(personal);
		PersonalTrainer aux = academia.getPersonal(0);
		assertEquals(personal, aux);
	}

	@Test
	public void removerPersonal() {

		PersonalTrainer personal = criarPersonal();
		academia.adcionarPersonal(personal);
		academia.removerPersonal(personal);
		assertEquals(0, academia.quantidadeDePersonals());
	}

	@Test
	public void adicionarPersonalDiferente() {

		PersonalTrainer personal = criarPersonal();
		academia.adcionarPersonal(personal);
		personal = criarPersonalAxiliar();
		academia.adcionarPersonal(personal);
		PersonalTrainer aux = academia.getPersonal(1);
		assertEquals(personal, aux);
	}

	@Test
	public void quantidadeDePersonal() {

		PersonalTrainer personal = criarPersonal();
		academia.adcionarPersonal(personal);
		PersonalTrainer personal2 = criarPersonalAxiliar();
		academia.adcionarPersonal(personal2);
		assertEquals(2, academia.quantidadeDePersonals());
	}

	@Test
	public void atualizarPersonal() {

		PersonalTrainer personal = criarPersonal();
		academia.adcionarPersonal(personal);
		PersonalTrainer personal2 = criarPersonalAxiliar();
		academia.atualizarPersonal(personal, personal2);
		assertEquals(personal2, academia.getPersonal(0));
	}

	public Aluno criarAluno() {

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
		return aluno;
	}

	public Aluno criarAlunoAuxiliar() {

		Aluno aluno2 = new Aluno();
		Endereco end2 = new Endereco();
		Modalidade modalidade2 = new Modalidade();

		aluno2.setNome("Mailton");
		aluno2.setEmail("mailton.fernandes@dce.ufpb.br");
		aluno2.setMatricula(2);
		aluno2.setTelefone("000000");
		modalidade2.setNome("natacao");
		modalidade2.setValor(100);
		end2.setRua("Rua A");
		end2.setNumero("10");
		end2.setComplemento("casa");
		end2.setBairro("centro");
		end2.setCidade("Mamanguape");
		end2.setEstado("PB");
		aluno2.setEndereco(end2);
		aluno2.setModalidade(modalidade2);
		return aluno2;
	}

	public Professor criarProfessor() {

		Professor professor = new Professor();
		Endereco end = new Endereco();

		end.setRua("Palmeiras 2 Divis�o");
		end.setNumero("11");
		end.setComplemento("333");
		end.setBairro("Centro");
		end.setCidade("Campina Grande");
		end.setEstado("PB");
		professor.setNome("Rodrigo Vilar");
		professor.setEmail("rodriogovilar@gmail.com");
		professor.setEndereco(end);
		professor.setMatricula(1);
		professor.setTelefone("0800-3333");
		professor.setSalario("1000.0");
		professor.setCpf("12311222");
		return professor;

	}

	public Professor criarProfessorAuxiliar() {

		Professor professor2 = new Professor();
		Endereco end = new Endereco();

		end.setRua("uma rua qualquer");
		end.setNumero("1000");
		end.setComplemento("blablabla");
		end.setBairro("Centro");
		end.setCidade("terra Do Nuca");
		end.setEstado("PB");
		professor2.setNome("Albert");
		professor2.setEmail("albert@dce.ufpb.br");
		professor2.setEndereco(end);
		professor2.setMatricula(111);
		professor2.setTelefone("0800-1111");
		professor2.setSalario("5000.0");
		professor2.setCpf("22222222");
		return professor2;
	}

	public PersonalTrainer criarPersonal() {

		PersonalTrainer personal = new PersonalTrainer();
		Endereco end = new Endereco();

		end.setRua("Joao Aquino 2 Divis�o");
		end.setNumero("155");
		end.setComplemento("555");
		end.setBairro("Tambau");
		end.setCidade("Joao Pessoa");
		end.setEstado("PB");
		personal.setNome("Waltercio Vilar");
		personal.setEmail("walterciovilar@gmail.com");
		personal.setEndereco(end);
		personal.setMatricula(1);
		personal.setTelefone("3235-3333");
		personal.setDescricao("Traballho seg a sabado");
		personal.setDiaria("R$ 20,00");
		return personal;
	}

	public PersonalTrainer criarPersonalAxiliar() {

		PersonalTrainer personal = new PersonalTrainer();
		Endereco end = new Endereco();

		end.setRua("rua da Alvorada");
		end.setNumero("234");
		end.setComplemento("3456");
		end.setBairro("Centro");
		end.setCidade("Rio Tinto");
		end.setEstado("PB");
		personal.setNome("Everton");
		personal.setEmail("Everton@gmail.com");
		personal.setEndereco(end);
		personal.setMatricula(8);
		personal.setTelefone("3235-4444");
		personal.setDescricao("Traballho seg a sabado");
		personal.setDiaria("R$ 20,00");
		return personal;
	}

}
