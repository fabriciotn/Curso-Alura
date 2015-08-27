package Interpreter_Visitor;

public class ImpressoraVisitorPreFixo implements Visitor{
	@Override
	public void visitaSoma(Soma soma) {
		System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        soma.getDireita().aceita(this);
        System.out.print(")");

    }

    @Override
	public void visitaSubtracao(Subtracao subtracao) {
    	System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
	public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }

}
