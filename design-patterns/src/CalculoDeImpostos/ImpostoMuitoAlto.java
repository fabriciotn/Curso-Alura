package CalculoDeImpostos;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}
	
	public ImpostoMuitoAlto() {
	}
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
