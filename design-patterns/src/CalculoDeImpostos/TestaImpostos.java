package CalculoDeImpostos;
public class TestaImpostos {

	public static void main(String[] args) {
		
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();
		
		CalculadorDeImposto calculadora = new CalculadorDeImposto();
		
		Orcamento orcamento = new Orcamento(3001.0);
		
		calculadora.calcula(orcamento, iss);
		calculadora.calcula(orcamento, icms);
		calculadora.calcula(orcamento, iccc);
		
	}

}
