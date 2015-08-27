package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		List<ContaPoupanca> lista = new ArrayList<ContaPoupanca>();
		
		ContaPoupanca cc1 = new ContaPoupanca("Fabricio", 1300.0);
		ContaPoupanca cc2 = new ContaPoupanca("Andreia", 120);
		ContaPoupanca cc3 = new ContaPoupanca("Teste", 99999.0);
		ContaPoupanca cc4 = new ContaPoupanca("Bruno", 10);
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		Collections.sort(lista);
		//Collections.reverse(lista);
		//Collections.shuffle(lista);
		//Collections.rotate(lista, 0);
		
		for (ContaPoupanca c : lista) {
			System.out.println(c);
		}
	}
}
