package br.com.alura.exercicio5;

public class ContaComum {
	
	private ManipuladorDeSaldo manipulador;
	
    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }
    
    public void saca(double valor){
    	manipulador.saca(valor);
    }
    
    public void deposita(double valor){
    	manipulador.deposita(valor);
    }
    
    public void somaInvestimento(){
        this.manipulador.rende(1.1);
    }
    
    public double getSaldo(){
    	return this.manipulador.getSaldo();
    }
}
