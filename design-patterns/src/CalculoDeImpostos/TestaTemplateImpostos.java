package CalculoDeImpostos;

import Descontos.Item;

public class TestaTemplateImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600);
		orcamento.adicionaItem(new Item("Item1", 100.0));
		orcamento.adicionaItem(new Item("Item1", 400.0));
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		IHIT ihit = new IHIT();
		
		System.out.println("valor ICPP: " + icpp.calcula(orcamento));
		System.out.println("valor IKCV: " + ikcv.calcula(orcamento));
		System.out.println("valor IHIT: " + ihit.calcula(orcamento));
	}
}
