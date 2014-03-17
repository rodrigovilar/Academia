package br.ufpb.academia.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.ufpb.academia.fachada.FachadaAcademia;
import br.ufpb.academia.model.Aluno;
import br.ufpb.academia.model.Endereco;
import br.ufpb.academia.model.Modalidade;
import br.ufpb.academia.model.PersonalTrainer;
import br.ufpb.academia.model.Professor;

public class AcademiaTest {
	private FachadaAcademia academia = new FachadaAcademia();
	private Aluno aluno, alunoAuxiliar, alunoSemDados;
	private Professor professor, professorAuxiliar, professorSemDados;
	private PersonalTrainer personalTrainer, personalTrainerAuxiliar, personalTrainerSemDados;

	@Before
	public void setUp() {
		aluno = criarAluno();
		alunoAuxiliar = criarAlunoAuxiliar();
		alunoSemDados = criarAlunoSemDados();
		
		professor = criarProfessor();
		professorAuxiliar = criarProfessorAuxiliar();
		professorSemDados = criarProfessorSemDados();
		
		personalTrainer = criarPersonalTrainer();
		personalTrainerAuxiliar = criarPersonalTrainerAxiliar();
		personalTrainerSemDados = criarPersonalTrainerSemDados();
	}

	@Test
	public void adicionarAluno() {
		academia.adicionarAluno(aluno);
		assertEquals(1, academia.quantidadeDeAlunos());
		
		academia.adicionarAluno(alunoAuxiliar);
		assertEquals(2, academia.quantidadeDeAlunos());
	}
	
	@Test
	public void adicionarAlunoSemNome() {
		academia.adicionarAluno(alunoSemDados);
		assertEquals(0, academia.quantidadeDeAlunos());
	}
	
	@Test
	public void adicionarAlunoSemMatricula() {
		academia.adicionarAluno(alunoSemDados);
		assertEquals(0, academia.quantidadeDeAlunos());
	}
	
	@Test
	public void adicionarAlunoSemModalidade() {
		academia.adicionarAluno(alunoSemDados);
		assertEquals(0, academia.quantidadeDeAlunos());
	}
	
	@Test
	public void adicionarAlunoComMatriculaJaCadastrada() {
		academia.adicionarAluno(aluno);
		assertEquals(1, academia.quantidadeDeAlunos());
		
		academia.adicionarAluno(aluno);
		assertEquals(1, academia.quantidadeDeAlunos());
	}

	@Test
	public void removerAluno() {
		academia.adicionarAluno(aluno);
		assertEquals(1, academia.quantidadeDeAlunos());
		
		academia.removerAluno(aluno);
		assertEquals(0, academia.quantidadeDeAlunos());
	}

	@Test
	public void quantidadeDeAlunos() {
		academia.adicionarAluno(aluno);
		academia.adicionarAluno(alunoAuxiliar);
		assertEquals(2, academia.quantidadeDeAlunos());
	}

	@Test
	public void atualizarAluno() {
		academia.adicionarAluno(aluno);
		assertEquals(aluno, academia.getAluno(0));
		assertEquals(aluno.getNome(), academia.getAluno(0).getNome());
		assertEquals(aluno.getEmail(), academia.getAluno(0).getEmail());
		assertEquals(aluno.getMatricula(), academia.getAluno(0).getMatricula());
		
		// aluno que vai substituir o aluno já cadastrado
		academia.atualizarAluno(aluno, alunoAuxiliar);
		assertEquals(alunoAuxiliar, academia.getAluno(0));
		assertEquals(alunoAuxiliar.getNome(), academia.getAluno(0).getNome());
		assertEquals(alunoAuxiliar.getEmail(), academia.getAluno(0).getEmail());
		assertEquals(alunoAuxiliar.getMatricula(), academia.getAluno(0).getMatricula());
	}

	@Test
	public void adicionarProfessor() {
		academia.adicionarProfessor(professor);
		assertEquals(1, academia.quantidadeDeProfessores());
		
		academia.adicionarProfessor(professorAuxiliar);
		assertEquals(2, academia.quantidadeDeProfessores());
	}
	
	@Test
	public void adicionarProfessorSemNome() {
		academia.adicionarProfessor(professorSemDados);
		assertEquals(0, academia.quantidadeDeProfessores());
	}
	
	@Test
	public void adicionarProfessorSemMatricula() {
		academia.adicionarProfessor(professorSemDados);
		assertEquals(0, academia.quantidadeDeProfessores());
	}
	
	@Test
	public void adicionarProfessorSemCpf() {
		academia.adicionarProfessor(professorSemDados);
		assertEquals(0, academia.quantidadeDeProfessores());
	}
	
	@Test
	public void adicionarProfessorComMatriculaJaCadastrada() {
		academia.adicionarProfessor(professor);
		assertEquals(1, academia.quantidadeDeProfessores());
		
		academia.adicionarProfessor(professor);
		assertEquals(1, academia.quantidadeDeProfessores());
	}

	@Test
	public void removerProfessor() {
		academia.adicionarProfessor(professor);
		assertEquals(1, academia.quantidadeDeProfessores());
		
		academia.removerProfessor(professor);
		assertEquals(0, academia.quantidadeDeProfessores());
	}

	@Test
	public void quantidadeDeProfessor() {
		academia.adicionarProfessor(professor);
		academia.adicionarProfessor(professorAuxiliar);
		assertEquals(2, academia.quantidadeDeProfessores());
	}

	@Test
	public void atualizarProfessor() {
		academia.adicionarProfessor(professor);
		assertEquals(professor, academia.getProfessor(0));
		assertEquals(professor.getNome(), academia.getProfessor(0).getNome());
		assertEquals(professor.getEmail(), academia.getProfessor(0).getEmail());
		assertEquals(professor.getMatricula(), academia.getProfessor(0).getMatricula());
		
		// professor que vai substituir o professor já adicionado
		academia.atualizarProfessor(professor, professorAuxiliar);
		assertEquals(professorAuxiliar, academia.getProfessor(0));
		assertEquals(professorAuxiliar.getNome(), academia.getProfessor(0).getNome());
		assertEquals(professorAuxiliar.getEmail(), academia.getProfessor(0).getEmail());
		assertEquals(professorAuxiliar.getMatricula(), academia.getProfessor(0).getMatricula());
	}

	@Test
	public void adicionarPersonal() {
		academia.adicionarPersonal(personalTrainer);
		assertEquals(1, academia.quantidadeDePersonals());
		
		academia.adicionarPersonal(personalTrainerAuxiliar);
		assertEquals(2, academia.quantidadeDePersonals());
	}
	
	@Test
	public void adicionarPersonalSemNome() {
		academia.adicionarPersonal(personalTrainerSemDados);
		assertEquals(0, academia.quantidadeDePersonals());
	}
	
	@Test
	public void adicionarPersonalSemMatricula() {
		academia.adicionarPersonal(personalTrainerSemDados);
		assertEquals(0, academia.quantidadeDePersonals());
	}
	
	@Test
	public void adicionarPersonalSemDiariaEDescricao() {
		academia.adicionarPersonal(personalTrainerSemDados);
		assertEquals(0, academia.quantidadeDePersonals());
	}
	
	@Test
	public void adicionarPersonalComMatriculaJaCadastrada() {
		academia.adicionarPersonal(personalTrainer);
		assertEquals(1, academia.quantidadeDePersonals());
		
		academia.adicionarPersonal(personalTrainer);
		assertEquals(1, academia.quantidadeDePersonals());
	}

	@Test
	public void removerPersonal() {
		academia.adicionarPersonal(personalTrainer);
		assertEquals(1, academia.quantidadeDePersonals());
		
		academia.removerPersonal(personalTrainer);
		assertEquals(0, academia.quantidadeDePersonals());
	}

	@Test
	public void quantidadeDePersonal() {
		academia.adicionarPersonal(personalTrainer);
		academia.adicionarPersonal(personalTrainerAuxiliar);
		assertEquals(2, academia.quantidadeDePersonals());
	}

	@Test
	public void atualizarPersonal() {
		academia.adicionarPersonal(personalTrainer);
		assertEquals(personalTrainer, academia.getPersonal(0));
		assertEquals(personalTrainer.getNome(), academia.getPersonal(0).getNome());
		assertEquals(personalTrainer.getEmail(), academia.getPersonal(0).getEmail());
		assertEquals(personalTrainer.getMatricula(), academia.getPersonal(0).getMatricula());
		
		// personal que vai substituir o personal já cadastrado
		academia.atualizarPersonal(personalTrainer, personalTrainerAuxiliar);
		assertEquals(personalTrainerAuxiliar, academia.getPersonal(0));
		assertEquals(personalTrainerAuxiliar.getNome(), academia.getPersonal(0).getNome());
		assertEquals(personalTrainerAuxiliar.getEmail(), academia.getPersonal(0).getEmail());
		assertEquals(personalTrainerAuxiliar.getMatricula(), academia.getPersonal(0).getMatricula());
	}

	public Aluno criarAluno() {
		Aluno aluno = new Aluno();
		Endereco endereco = new Endereco();
		Modalidade modalidade = new Modalidade();

		aluno.setNome("Heitor");
		aluno.setEmail("heitor@gmail.com");
		aluno.setMatricula("1");
		aluno.setTelefone("2356450");
		
		modalidade.setNome("musculaï¿½ï¿½o");
		modalidade.setValor(70);
		aluno.setModalidade(modalidade);
		
		endereco.setRua("Otavio Felix");
		endereco.setNumero("101");
		endereco.setComplemento("Apt 103");
		endereco.setBairro("jose americo de Almeida");
		endereco.setCidade("Joao Pessoa");
		endereco.setEstado("PB");
		aluno.setEndereco(endereco);
		
		return aluno;
	}

	public Aluno criarAlunoAuxiliar() {
		Aluno alunoAuxiliar = new Aluno();
		Endereco endereco = new Endereco();
		Modalidade modalidade = new Modalidade();

		alunoAuxiliar.setNome("Mailton");
		alunoAuxiliar.setEmail("mailton.fernandes@dce.ufpb.br");
		alunoAuxiliar.setMatricula("2");
		alunoAuxiliar.setTelefone("000000");
		
		modalidade.setNome("natacao");
		modalidade.setValor(100);
		alunoAuxiliar.setModalidade(modalidade);
		
		endereco.setRua("Rua A");
		endereco.setNumero("10");
		endereco.setComplemento("casa");
		endereco.setBairro("centro");
		endereco.setCidade("Mamanguape");
		endereco.setEstado("PB");
		alunoAuxiliar.setEndereco(endereco);
		
		return alunoAuxiliar;
	}

	public Aluno criarAlunoSemDados() {
		Aluno alunoSemDados = new Aluno();
		alunoSemDados.setEndereco(new Endereco());
		alunoSemDados.setModalidade(new Modalidade());
		
		return alunoSemDados;
	}

	public Professor criarProfessor() {
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		
		professor.setNome("Rodrigo Vilar");
		professor.setEmail("rodriogovilar@gmail.com");
		professor.setMatricula("1");
		professor.setTelefone("0800-3333");
		professor.setSalario(1000);
		professor.setCpf("12311222");

		endereco.setRua("Palmeiras 2 Divisão");
		endereco.setNumero("11");
		endereco.setComplemento("333");
		endereco.setBairro("Centro");
		endereco.setCidade("Campina Grande");
		endereco.setEstado("PB");
		professor.setEndereco(endereco);
		
		return professor;
	}

	public Professor criarProfessorAuxiliar() {
		Professor professorAuxiliar = new Professor();
		Endereco endereco = new Endereco();
		
		professorAuxiliar.setNome("Albert");
		professorAuxiliar.setEmail("albert@dce.ufpb.br");
		professorAuxiliar.setMatricula("111");
		professorAuxiliar.setTelefone("0800-1111");
		professorAuxiliar.setSalario(5000);
		professorAuxiliar.setCpf("22222222");

		endereco.setRua("uma rua qualquer");
		endereco.setNumero("1000");
		endereco.setComplemento("blablabla");
		endereco.setBairro("Centro");
		endereco.setCidade("terra Do Nuca");
		endereco.setEstado("PB");
		professorAuxiliar.setEndereco(endereco);
		
		return professorAuxiliar;
	}

	public Professor criarProfessorSemDados() {
		Professor professorAuxiliar = new Professor();
		professorAuxiliar.setEndereco(new Endereco());
		
		return professorAuxiliar;
	}

	public PersonalTrainer criarPersonalTrainer() {
		PersonalTrainer personalTrainer = new PersonalTrainer();
		Endereco endereco = new Endereco();

		personalTrainer.setNome("Waltercio Vilar");
		personalTrainer.setEmail("walterciovilar@gmail.com");
		personalTrainer.setMatricula("1");
		personalTrainer.setTelefone("3235-3333");
		personalTrainer.setDescricao("Traballho seg a sabado");
		personalTrainer.setDiaria("R$ 20,00");

		endereco.setRua("Joao Aquino 2 Divisão");
		endereco.setNumero("155");
		endereco.setComplemento("555");
		endereco.setBairro("Tambau");
		endereco.setCidade("Joao Pessoa");
		endereco.setEstado("PB");
		personalTrainer.setEndereco(endereco);
		
		return personalTrainer;
	}

	public PersonalTrainer criarPersonalTrainerAxiliar() {
		PersonalTrainer personalTrainerAuxiliar = new PersonalTrainer();
		Endereco endereco = new Endereco();

		personalTrainerAuxiliar.setNome("Everton");
		personalTrainerAuxiliar.setEmail("Everton@gmail.com");
		personalTrainerAuxiliar.setMatricula("8");
		personalTrainerAuxiliar.setTelefone("3235-4444");
		personalTrainerAuxiliar.setDescricao("Traballho seg a sabado");
		personalTrainerAuxiliar.setDiaria("R$ 20,00");
		
		endereco.setRua("rua da Alvorada");
		endereco.setNumero("234");
		endereco.setComplemento("3456");
		endereco.setBairro("Centro");
		endereco.setCidade("Rio Tinto");
		endereco.setEstado("PB");
		personalTrainerAuxiliar.setEndereco(endereco);
		
		return personalTrainerAuxiliar;
	}

	public PersonalTrainer criarPersonalTrainerSemDados() {
		PersonalTrainer personalTrainerAuxiliar = new PersonalTrainer();
		personalTrainerAuxiliar.setEndereco(new Endereco());
		
		return personalTrainerAuxiliar;
	}
}