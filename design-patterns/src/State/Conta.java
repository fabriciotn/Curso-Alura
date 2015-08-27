package State;

public class Conta {

	protected double saldo;
    protected EstadoDaConta estado;

    public void saca(double valor) {
      estado.saca(this, valor);
    }

    public void deposita(double valor) {
      estado.deposita(this, valor);
    }
}
