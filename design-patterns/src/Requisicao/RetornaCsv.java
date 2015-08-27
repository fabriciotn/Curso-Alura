package Requisicao;

public class RetornaCsv implements Resposta {

	Resposta proximaResposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + ";" + conta.getSaldo());
		} else if(proximaResposta == null){
			throw new RuntimeException("Sem resposta");
		}else {
			proximaResposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.proximaResposta = resposta;
	}

	@Override
	public void setProxima() {
		this.proximaResposta = null;
	}
}
