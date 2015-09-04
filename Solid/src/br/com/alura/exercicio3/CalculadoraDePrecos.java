package br.com.alura.exercicio3;

public class CalculadoraDePrecos {
	
	private Frete transportadora;
	private TabelaDePreco tabela;

	public CalculadoraDePrecos(TabelaDePreco tabela, Frete transportadora) {
		this.tabela = tabela;
		this.transportadora = transportadora;
	}

	public double calcula(Compra produto) {
        double desconto = tabela.descontoPara(produto.getValor());
        double frete = transportadora.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
