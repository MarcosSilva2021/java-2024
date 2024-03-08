package br.edu.unichristus.aula03.model.pessoa;

import java.util.Date;


public abstract class Pessoa {
	
	private String nome;
	private Date dataNascimento;
	private String cpf;
	private Float altura; // classe reple do java - é melhor que o primitivo

	public abstract void cadastrar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", altura=" + altura
				+ ", getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getCpf()=" + getCpf()
				+ ", getAltura()=" + getAltura() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
