package Requisicao;

public class Conta {

	private double saldo;
	private String titular;
	
	public Conta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}
}
