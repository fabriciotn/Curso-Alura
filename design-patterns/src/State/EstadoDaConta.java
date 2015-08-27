package State;

public interface EstadoDaConta {

	void saca(Conta conta, double valor);
    void deposita(Conta conta, double valor);
}
