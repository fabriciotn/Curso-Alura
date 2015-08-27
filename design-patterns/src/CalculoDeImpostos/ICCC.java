package CalculoDeImpostos;

public class ICCC extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		Double valorDoImposto = 0.0;
		
		if(orcamento.getValor() < 1000.0){
			valorDoImposto = orcamento.getValor() * 0.05;
		}else if(orcamento.getValor() >= 1000.0 && orcamento.getValor() <= 3000.0){
			valorDoImposto = orcamento.getValor() * 0.07;
		}else{
			valorDoImposto = ((orcamento.getValor() * 0.05) + 30.0);
		}
		
		return valorDoImposto;
	}

}
