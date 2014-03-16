package br.ufpb.academia.gerenciador;

import java.util.ArrayList;
import java.util.List;
import br.ufpb.academia.model.PersonalTrainer;

public class GerenciadorPersonalTrainer {

	List<PersonalTrainer> listaPersonals = new ArrayList<>();

	public void adcionarPersonal(PersonalTrainer personal) {
		listaPersonals.add(personal);
	}

	public void removerPersonal(PersonalTrainer personal) {
		listaPersonals.remove(personal);
	}

	public PersonalTrainer buscarPersonal(int matricula) {
		for (PersonalTrainer personal : listaPersonals) {
			if (personal.getMatricula() == matricula) {
				return personal;
			}
		}

		return null;
	}

	public int quantidadeDePersonal() {
		return listaPersonals.size();
	}

	public PersonalTrainer getPersonal(int posicao) {
		return listaPersonals.get(posicao);
	}

	public void atualizarPersonal(Object p1, Object p2) {
		for (int i = 0; i < this.listaPersonals.size(); i++) {
			if (this.listaPersonals.get(i).equals(p1)) {
				this.listaPersonals.set(i, (PersonalTrainer) p2);
			}
		}

	}

}
