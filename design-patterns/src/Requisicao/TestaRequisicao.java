package Requisicao;

public class TestaRequisicao {

	public static void main(String[] args) {
		Conta c1 = new Conta("Fabricio", 1000.0);
		c1.deposita(200.0);
		
		//Requisicao req = new Requisicao(Formato.CSV);
		Requisicao req = new Requisicao(Formato.XML);
		//Requisicao req = new Requisicao(Formato.PORCENTO);
		
		OrdenadorDeRequisicoes ordenador = new OrdenadorDeRequisicoes();
		ordenador.ordena(req, c1);
		
	}
}
  