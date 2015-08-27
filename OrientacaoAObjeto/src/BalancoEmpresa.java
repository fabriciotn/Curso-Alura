
public class BalancoEmpresa {
	private ArmazenadorDeDividas dividas;

	public BalancoEmpresa(ArmazenadorDeDividas dividas) {
		this.dividas = dividas;
	}

	public void registraDivida(Divida divida) {
		dividas.salva(divida);
	}

	public void pagaDivida(Documento documento, Pagamento pagamento) {
		Divida divida = dividas.carrega(documento);
		if (divida != null) {
			divida.registra(pagamento);
		}
	}
}