package br.com.empresa.banco.sistema;
import br.com.empresa.banco.conta.Conta;


public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public double getSaldoTotal() {
        return saldoTotal;
    }
    
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    public void setSelic(double selic) {
		this.selic = selic;
	}
    
    public void teste(Conta c) {
		
	}

    public void roda(Conta c) {
        System.out.println("\nSaldo anterior: " + c.getSaldo());
        c.atualiza(selic);
        System.out.println("Saldo final: " + c.getSaldo());
        saldoTotal += c.getSaldo();
    }
}
