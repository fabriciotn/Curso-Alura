package Interpreter_Visitor;

public class TestaInterpreter {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
	    Expressao direita = new Soma(new Numero(2), new Numero(10));

	    Expressao conta = new Soma(esquerda, direita);
	    //Expressao conta = new RaizQuadrada(new Numero(9));

	    int resultado = conta.avalia();
	    System.out.println(resultado);
	    
	    System.out.println("Convencional");
	    Visitor visitor = new ImpressoraVisitor();
        conta.aceita(visitor);
        
        System.out.println("\nPré-fixa");
        
        visitor = new ImpressoraVisitorPreFixo();
        conta.aceita(visitor);
        
        
	}
}
