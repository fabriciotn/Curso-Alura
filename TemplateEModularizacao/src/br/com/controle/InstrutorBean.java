package br.com.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.modelo.Instrutor;

@ManagedBean
public class InstrutorBean {

	private List<Instrutor> instrutores = new ArrayList<Instrutor>();

	public InstrutorBean() {
		Instrutor rafael = new Instrutor();
		rafael.setNome("Rafael");
		rafael.setDataDeNascimento("01/02/1999");
		
		Instrutor marcelo = new Instrutor();
		marcelo.setNome("Marcelo");
		marcelo.setDataDeNascimento("30/10/2000");
		
		this.instrutores.add(rafael);
		this.instrutores.add(marcelo);
	}
	
	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}
	
	
}
