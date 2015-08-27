package Thread;

import java.util.Collection;
import java.util.Vector;

public class ProduzMensagens implements Runnable {
	private int comeco;
	private int fim;
	private Vector<String> mensagens;

	public ProduzMensagens(int comeco, int fim, Vector<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	public void run() {
		for (int i = comeco; i < fim; i++) {
			mensagens.add("Mensagem " + i);
		}
	}
}
