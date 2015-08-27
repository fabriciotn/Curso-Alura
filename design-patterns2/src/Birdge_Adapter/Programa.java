package Birdge_Adapter;

import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) {
		Mapa mapaGoogle = new GoogleMaps();
		String mapa = mapaGoogle.devolveMapa("rua maria das couves");
		
		Calendar relogio = new RelogioAtual().hoje();
		
		System.out.println(relogio);
	}

}
