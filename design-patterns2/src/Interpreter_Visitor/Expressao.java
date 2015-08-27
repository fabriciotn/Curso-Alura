package Interpreter_Visitor;

public interface Expressao {

	int avalia();
	void aceita(Visitor visitor);
}
