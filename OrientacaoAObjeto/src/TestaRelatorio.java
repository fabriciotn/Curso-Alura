import java.text.NumberFormat;
import java.util.Locale;


public class TestaRelatorio {

	public static void main(String[] args) {
		Divida divida = new Divida();
		divida.setCredor("Fabricio Teixeira Nascimento");
		divida.setDocumentoCredor(new Cnpj("01.111.999/0001-01"));
		divida.setTotal(1500);
		
		//NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		
		RelatorioDeDivida relatorio = new RelatorioDeDivida(divida);
		relatorio.geraRelatorio(formatador);
	}
}
