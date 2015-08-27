package Relatorios;

import java.util.List;

public class RelatorioSimples extends Relatorio{

	@Override
	protected void rodape() {
		System.out.println("Telefone: 0800 000 000");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		}
		
	}

	@Override
	protected void cabecalho() {
		System.out.println("Banco do Brasil");
	}

	
}
