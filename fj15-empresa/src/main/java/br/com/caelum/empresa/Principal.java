package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class Principal {
	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1982, 01, 26);
		Funcionario funcionario = new Funcionario("Fabricio", 20, dataNascimento);
		System.out.println(funcionario);
		//System.err.println(funcionario);
		//System.out.println("Principal.main()");
		
		Gasto gasolina = new Gasto(150.0,"Transporte",funcionario,new GregorianCalendar(),true);
		Gasto compra = new Gasto(100.0,"Domestica", funcionario,new GregorianCalendar(), false);
		Gasto prestacao = new Gasto(500.00,"Fixa",funcionario,new GregorianCalendar(),true);
		
		System.out.println(gasolina);
		System.out.println(compra);
		System.out.println(prestacao);
	}
}
