package br.com.alura.exercicio2;

public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Nota fiscal gravada!");
	}
	
}
