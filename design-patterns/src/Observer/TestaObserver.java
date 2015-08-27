package Observer;

import java.util.ArrayList;
import java.util.List;

import Build.ItemDaNota;
import Build.NotaFiscal;
import Build.NotaFiscalBuilder;
import Descontos.Item;

public class TestaObserver {

	public static void main(String[] args) {
		ArrayList<AcaoAposGerarNota> acoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
		acoesASeremExecutadas.add(new EnviadorDeEmail());
		acoesASeremExecutadas.add(new NotaFiscalDAO());
		acoesASeremExecutadas.add(new Multiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoesASeremExecutadas);
		
		NotaFiscal notaFiscal = builder.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.com(new ItemDaNota("item 1", 100.0))
				.com(new ItemDaNota("item 2", 200.0))
				.com(new ItemDaNota("item 3", 300.0))
				.comObservacoes("entregar notaFiscal pessoalmente").constroi();
	}
}
