package br.com.alura.exercicio3;

public class Correios implements Frete{

	public double para(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
