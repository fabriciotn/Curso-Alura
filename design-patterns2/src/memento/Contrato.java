package memento;

import java.util.Calendar;

public class Contrato {

	private Calendar data;
	private String nome;
	private Tipo tipo;
	
	public Contrato(Calendar data, String nome, Tipo tipo) {
		this.data = data;
		this.nome = nome;
		this.tipo = tipo;
	}

	public void avanca(){
		if(tipo == Tipo.NOVO) tipo = Tipo.EM_ANDAMENTO;
		else if(tipo == Tipo.EM_ANDAMENTO) tipo = Tipo.ACERTADO;
		else if(tipo == Tipo.ACERTADO) tipo = Tipo.CONCLUIDO;
	}
	
	public Calendar getData() {
		return data;
	}
	public String getNome() {
		return nome;
	}
	public Tipo getTipo() {
		return tipo;
	}
	
	public Estado salvaEstado() {
        return new Estado(new Contrato(data, nome, tipo));
    }
	
	public void restaura(Estado estado) {
        this.data = estado.getEstado().getData();
        this.nome = estado.getEstado().getNome();
        this.tipo = estado.getEstado().getTipo();
    }
}
