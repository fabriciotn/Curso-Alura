public class Divida {

	private String credor;
	private Documento documentoCredor;
	private double total;
	private Pagamentos pagamentos = new Pagamentos();

	public double getTotal() {
		return this.total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}

	public String getCredor() {
		return this.credor;
	}

	public Documento getDocumentoCredor() {
		return documentoCredor;
	}

	public void setDocumentoCredor(Documento documentoCredor) {
		this.documentoCredor = documentoCredor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public double valorAPagar() {
		return this.total - this.pagamentos.getValorPago();
	}
	
	public void registra(Pagamento p){
		this.pagamentos.registra(p);
	}
}