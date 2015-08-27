package Command;

public class ConcluiPedido implements Comando{

	private Pedido pedido;

	public ConcluiPedido(Pedido pedido) {
		this.pedido = pedido;
		
	}
	
	@Override
	public void executa() {
		pedido.finaliza();
		System.out.println("finalizando pedido de " + pedido.getCliente());
	}

}
