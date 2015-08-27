package Relatorios;

import javax.management.relation.RelationService;

public class TestaRelatorios {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Fabricio", "0090", "1234", 500.0);
		Conta c2 = new Conta("Andreia", "1231", "098876", 1000.0);
		
		Relatorio relatorioCompleto = new RelatorioCompleto();
		Relatorio relatorioSimples = new RelatorioSimples();
	}

}
