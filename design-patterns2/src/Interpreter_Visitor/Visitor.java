package Interpreter_Visitor;

public interface Visitor {

	public abstract void visitaSoma(Soma soma);

	public abstract void visitaSubtracao(Subtracao subtracao);

	public abstract void visitaNumero(Numero numero);

}