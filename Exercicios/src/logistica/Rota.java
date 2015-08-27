package logistica;

public class Rota {
	private int linha = 0;
	private int coluna = 0;
	private int menorCaminho = 9999;
	private String sMenorCaminho = "";

	public Rota(String s, int tam, int matriz[][]) {// s==String completa com
													// todas a permutacoes
													// tam==tamanho de cada
													// caminho(sem retorno)

		for (int i = 0; i <= s.length() - tam; i += tam) {// numa mesma
															// string,estão
															// todas as
															// permutações em
															// sequencia (s)

			String subString = s.substring(i, i + tam);// criada uma substring
														// de s chamada
														// "subString", que terá
														// cada caminho
			int primeiraPosicao = 0;
			int caminhoCompleto = 0;
			String sCaminhoCompleto = "";
			String sCaminhoCompletoComRetorno = "";
			String sPrimeiraPosicao = "";
			for (int j = 0; j < subString.length(); j++) {// percorrerá todo "um
															// caminho" ao fim
															// do FOR
				int caminho = 0;
				String sCaminho = "";
				if (j == subString.length() - 1) {// CCriada com o mesmo intuito
													// do ELSE, porém, caso seja
													// a ultima posicao
					// entrará nessa condição, para que a linha da matriz seja J
					// e a coluna seja o primeiro elemento da sequencia
					// ou seja, o retorno
					char cLinha = subString.charAt(j);
					String sLinha = String.valueOf(cLinha);
					linha = Integer.parseInt(sLinha);
					coluna = primeiraPosicao;
				} else {// parte que pegará a primeira string, converterá para
						// int e associará ela a um numero de linha na matriz
						// uma posição adiante, pegará o número de colunas
					char cLinha = subString.charAt(j);
					String sLinha = String.valueOf(cLinha);
					linha = Integer.parseInt(sLinha);
					char cColuna = subString.charAt(j + 1);
					String sColuna = String.valueOf(cColuna);
					coluna = Integer.parseInt(sColuna);
					if (j == 0) {
						char cPrimeiraPosicao = subString.charAt(j);
						sPrimeiraPosicao = String.valueOf(cPrimeiraPosicao);
						primeiraPosicao = Integer.parseInt(sPrimeiraPosicao);
					}
				}
				caminho = matriz[linha][coluna];
				char cCaminho = subString.charAt(j);
				sCaminho = String.valueOf(cCaminho);
				caminhoCompleto = caminhoCompleto + caminho;
				sCaminhoCompleto = sCaminhoCompleto + sCaminho;
			}
			sCaminhoCompletoComRetorno = sCaminhoCompleto + sPrimeiraPosicao;
			// Formou-se um caminho completo
			if (caminhoCompleto < menorCaminho) {
				menorCaminho = caminhoCompleto;
				sMenorCaminho = sCaminhoCompletoComRetorno;
			}
		}

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("O menor distância percorrida é: " + menorCaminho);

	}
}