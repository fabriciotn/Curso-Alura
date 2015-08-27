package br.com.empresa.banco.conta;
public abstract class Conta {

	protected double saldo;
	protected int numero;
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor){
		if(valor > 0){
			this.saldo += valor;
		}else{
			throw new ValorInvalidoException(valor);
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "esse objeto é uma conta de " + this.nome + " com saldo R$" + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj;
		
		return (this.numero == outraConta.getNumero()) && (this.nome == outraConta.getNome());
	}
}