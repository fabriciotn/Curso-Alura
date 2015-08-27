public class Cpf implements Documento {

	private String cpf;

	public Cpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean ehValido() {
		return true;
	}

	@Override
	public String getValor() {
		return cpf;
	}
}
