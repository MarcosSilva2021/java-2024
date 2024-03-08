package br.edu.unichristus.aula03.model.funcionario;

import java.util.ArrayList;
import java.util.List;

import br.edu.unichristus.aula03.model.pessoa.Pessoa;

public class Professor extends Pessoa {
	
	private List<String> disciplinas = new ArrayList<>();
	
	@Override
	public void cadastrar() {
		System.out.println("Cadastro Professor "+ getNome());
	}

	public List<String> getDusciplinas() {
		return disciplinas;
	}

	public void setDusciplinas(List<String> disciplinas) {
		this.disciplinas = disciplinas;
	}	

}
