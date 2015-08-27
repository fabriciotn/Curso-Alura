package CalculoDeImpostos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Descontos.EmAprovacao;
import Descontos.EstadoDeUmOrcamento;
import Descontos.Item;

public class Orcamento {

	public double valor;
	private final List<Item> itens;
	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item){
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}
	
	public void aplicaDescontoExtra(){
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova(){
		estadoAtual.aprova(this);
	}
	
	public void reprova(){
		estadoAtual.reprova(this);
	}
	
	public void finaliza(){
		estadoAtual.finaliza(this);
	}
}
