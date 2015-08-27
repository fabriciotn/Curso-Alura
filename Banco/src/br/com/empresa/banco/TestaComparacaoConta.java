package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		
		System.out.println("comparando com ==");
		if(cc1 == cc2)
			System.out.println("iguais");
		else
			System.out.println("diferentes");
		
		System.out.println("\n\ncomparando com equals");
		if(cc1.equals(cc2))
			System.out.println("iguais");
		else
			System.out.println("diferentes");
	}
}
