package Observer;

import Build.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salvando no banco!");	
	}

}
