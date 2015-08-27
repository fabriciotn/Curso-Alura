package CalculoDeImpostos;

import java.util.ArrayList;
import java.util.List;

import Relatorios.Conta;

class FiltroMaiorQue500MilReais extends Filtro {
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMaiorQue500MilReais() {
		super();
	}

	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getSaldo() > 50000)
				filtrada.add(c);
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}
}