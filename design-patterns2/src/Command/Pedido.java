package Command;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataDeFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Calendar getDataDeFinalizacao() {
		return dataDeFinalizacao;
	}
	public void setDataDeFinalizacao(Calendar dataDeFinalizacao) {
		this.dataDeFinalizacao = dataDeFinalizacao;
	}
	
	public void paga(){
		status = Status.PAGO;
	}
	
	public void finaliza(){
		status = Status.ENTREGUE;
		dataDeFinalizacao = Calendar.getInstance();
	}
}
