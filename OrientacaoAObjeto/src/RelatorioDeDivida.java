import java.text.NumberFormat;


public class RelatorioDeDivida {

	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador){
		System.out.println("Nome do credor: " + divida.getCredor());
		System.out.println("CNPJ do credor: " + divida.getDocumentoCredor());
		System.out.println("Valor a pagar : " + formatador.format(divida.valorAPagar()));
		System.out.println("Valor Total   : " + formatador.format(divida.getTotal()));
	}
}
