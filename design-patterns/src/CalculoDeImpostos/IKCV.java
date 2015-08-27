package CalculoDeImpostos;

import Descontos.Item;

public class IKCV extends TemplateDeImpostosCondicional{
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IKCV() {}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if(orcamento.getValor() > 500.0 && contemItemMaiorQueCem(orcamento)){
			return true;
		}
		return false;
	}

	private boolean contemItemMaiorQueCem(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100.0){
				return true;
			}
		}
		
		return false;
	}

}
