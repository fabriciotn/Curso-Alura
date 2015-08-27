package Interpreter_Visitor;

public class Subtracao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		int resultadoDaDireita = direita.avalia();
		int resultadoDaEsquerda = esquerda.avalia();
		return resultadoDaDireita - resultadoDaEsquerda;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSubtracao(this);
	}	
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}
}
