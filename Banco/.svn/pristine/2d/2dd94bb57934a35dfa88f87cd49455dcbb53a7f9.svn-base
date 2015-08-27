package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaContas {
	public static void main(String[] args) {
		
		//Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca("",0);

		//c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		//adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("\nSaldo Total: " + adc.getSaldoTotal());
		
		System.out.println(cc);
	}
}
