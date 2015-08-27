package Relatorios;

import java.util.Calendar;
import java.util.List;

public class RelatorioCompleto extends Relatorio {

	@Override
	protected void rodape() {
		System.out.println("bb@bb.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " - " + conta.getNumero()
					+ " - " + conta.getAgencia() + " - " + conta.getSaldo());
		}
	}

	@Override
	protected void cabecalho() {
		System.out.println("Banco do Brasil");
		System.out.println("Av. Afonso Pena, 1500");
		System.out.println("0800 000 0000");
	}
}
