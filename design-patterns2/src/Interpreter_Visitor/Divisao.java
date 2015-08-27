package Interpreter_Visitor;

public class Divisao implements Expressao{
	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	@Override
	public int avalia() {
		int resultadoDaDireita = direita.avalia();
		int resultadoDaEsquerda = esquerda.avalia();
		return resultadoDaDireita / resultadoDaEsquerda;
	}

	@Override
	public void aceita(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
}
