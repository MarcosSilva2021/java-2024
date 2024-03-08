package br.edu.unichristus.aula03;

import br.edu.unichristus.aula03.model.funcionario.Professor;
import br.edu.unichristus.aula03.model.funcionario.TecnicoAdmistrativo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Professor p1 = new Professor();
		TecnicoAdmistrativo ta1 = new TecnicoAdmistrativo();
		
		p1.setNome("João");
		p1.setCpf("123.123.123-23");
		p1.setAltura(1.78F);
		p1.setDataNascimento(new Date());
		
		ta1.setNome("Joab");
		ta1.setCpf("123.123.123-65");
		ta1.setAltura(1.80F);
		ta1.setDataNascimento(new Date());
		
		List<String> disciplinas = new ArrayList<>();
		disciplinas.add("logíca 1");
		disciplinas.add("Topicos especias");
		
		p1.setDusciplinas(disciplinas);
		
		//System.out.println(p1);
		
		//while(p1.getCpf().length() !=14) {
		//	p1.setCpf("123.123.123-21");
		//}
		
		for(int i=0; i < p1.getDusciplinas().size(); i++) {
			System.out.println(p1.getDusciplinas().get(i));
		}
		
		for (String disciplina : p1.getDusciplinas()) {
			System.out.println(disciplina);
		}
		
		
		
		
		
	}

}
