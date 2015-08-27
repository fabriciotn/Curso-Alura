package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<Conta>{
    
	public ContaPoupanca(String nome, double saldoInicial) {
		this.nome = nome;
		this.saldo = saldoInicial;
	}
	
	@Override
    public void atualiza(double taxa){
        this.saldo += this.saldo * (taxa * 3);
    }
    
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

	@Override
	public int compareTo(Conta novaConta) {
		return this.nome.compareTo(novaConta.nome);
	}
}