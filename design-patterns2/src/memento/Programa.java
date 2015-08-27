package memento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		Historico historico = new Historico();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio", Tipo.NOVO);
        historico.adiciona(contrato.salvaEstado());
        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        System.out.println(contrato.getTipo());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());
        System.out.println(contrato.getTipo());
        
        System.out.println("------------");
        
        contrato.restaura(historico.pega(3));
        System.out.println(contrato.getTipo());

        contrato.restaura(historico.pega(2));
        System.out.println(contrato.getTipo());
        
        contrato.restaura(historico.pega(1));
        System.out.println(contrato.getTipo());
        
        contrato.restaura(historico.pega(0));
        System.out.println(contrato.getTipo());
	}
}
