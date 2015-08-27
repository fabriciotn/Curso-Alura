package Descontos;

import CalculoDeImpostos.Orcamento;

public class TestaCorrente {

	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(1000.0);
		orcamento.adicionaItem(new Item("CANETA", 500.0));
		orcamento.adicionaItem(new Item("LAPIS", 500.0));

		double desconto = descontos.calcula(orcamento);
		System.out.println(desconto);
	}
}
