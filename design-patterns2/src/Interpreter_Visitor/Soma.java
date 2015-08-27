package Interpreter_Visitor;

public class Soma implements Expressao {

	private Expressao direita;
	private Expressao esquerda;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoDaDireita = direita.avalia();
		int resultadoDaEsquerda = esquerda.avalia();
		return resultadoDaDireita + resultadoDaEsquerda;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaSoma(this);
	}

	public Expressao getDireita() {
		return direita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
}
