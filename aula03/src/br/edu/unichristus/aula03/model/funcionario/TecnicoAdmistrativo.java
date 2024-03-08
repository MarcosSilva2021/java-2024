package br.edu.unichristus.aula03.model.funcionario;

import br.edu.unichristus.aula03.model.pessoa.Pessoa;

public class TecnicoAdmistrativo extends Pessoa {
	
	@Override
	public void cadastrar() {
		System.out.println("Cadastro tecnico "+ getNome());
	}

}
