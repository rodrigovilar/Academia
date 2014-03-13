package br.ufpb.academia.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.academia.fachada.FachadaAcademia;
import br.ufpb.academia.model.Aluno;

public class AcademiaTest {
	
	private FachadaAcademia academia;
	
	@Test
	public void test() {
		Aluno aluno = new Aluno();
				
		academia.adcionarAluno(aluno);
	}
	
	

}
