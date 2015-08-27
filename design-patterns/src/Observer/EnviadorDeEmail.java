package Observer;

import Build.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviado por e-mail");		
	}

}
