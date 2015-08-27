package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaTreeSet {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 1; i <= 1000; i++) {
			lista.add(i);
		}
		
		Collections.reverse(lista);
		
		for (Integer i : lista) {
			System.out.println(i);
		}
	}
}
