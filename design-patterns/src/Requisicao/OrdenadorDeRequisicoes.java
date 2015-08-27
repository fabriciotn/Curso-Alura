package Requisicao;

public class OrdenadorDeRequisicoes {

	public void ordena(Requisicao req, Conta conta){
		
		Resposta csv = new RetornaCsv();
		Resposta xml = new RetornaXml();
		Resposta porcento = new RetornaPorcento();
		Resposta semResposta = new RetornaSemResposta();
		
		csv.setProxima(xml);
		xml.setProxima(porcento);
		porcento.setProxima(xml);
		
		csv.responde(req, conta);
	}
}
