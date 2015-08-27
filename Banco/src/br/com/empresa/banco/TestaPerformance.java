package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	
	public static void main(String[] args) {
        System.out.println("Iniciando processo...");
        Collection<Integer> teste = new ArrayList<>();
        //Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();

        int total = 30000;

        System.out.println("início preenchimento");
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fimPreenchimento = System.currentTimeMillis();
        long tempoPreenchimento = fimPreenchimento - inicio;
        System.out.println("Tempo gasto para preencher: " + tempoPreenchimento);

        System.out.println("Inicio busca");
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long fimBusca = System.currentTimeMillis();
        long tempoBusca = fimBusca - inicio;
        System.out.println("Tempo gasto para buscar: " + tempoBusca);

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}
