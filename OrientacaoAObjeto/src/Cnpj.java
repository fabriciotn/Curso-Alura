
public class Cnpj implements Documento{

	private String cnpjCredor;
	

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public Cnpj(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public boolean ehValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}
	
	private int primeiroDigitoCorreto() {
		// Calcula o primeiro dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o primeiro dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}
	
	private int segundoDigitoCorreto() {
		// Calcula o segundo dígito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Extrai o segundo dígito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	@Override
	public int hashCode() {
		return this.getCnpjCredor().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cnpj)) {
            return false;
        } 
        Cnpj outro = (Cnpj) obj;
        return this.getCnpjCredor().equals(outro.getCnpjCredor());
	}
	
	@Override
	public String toString() {
		return cnpjCredor;
	}

	@Override
	public String getValor() {
		return cnpjCredor;
	}
}
