package br.com.caelum.modelo;

import com.thoughtworks.xstream.XStream;

public class Pessoa {
	private int idade;
	private String nome;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toXML() {
		XStream stream = new XStream();
		stream.alias("Pessoa", Pessoa.class);
		return stream.toXML(this);
	}

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(18);
		pessoa.setNome("Joao");
		System.out.println(pessoa.toXML());

	}
}
