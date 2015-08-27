package Descontos;

import CalculoDeImpostos.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public void setProximo(Desconto desconto) {
		// nao tem!
	}

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}
}
