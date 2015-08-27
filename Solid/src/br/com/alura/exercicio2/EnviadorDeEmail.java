package br.com.alura.exercicio2;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Envia e-mail!");
	}
}
