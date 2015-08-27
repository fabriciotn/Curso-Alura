package Relatorios;

import java.util.Calendar;

public class Conta {

	private double saldo;
	private String titular;
	private String agencia;
	private String numero;
	private Calendar dataAbertura;
	
	public Conta(String titular, String agencia, String numero, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
		this.agencia = agencia;
		this.numero = numero;
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

	public String getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}
}
