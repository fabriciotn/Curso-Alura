package Singleton_Facade;

public class ServicoSingleton {

	public static Servico instancia;
	
	public Servico getInstancia(){
		if(instancia == null){
			instancia = new Servico();
		}
		
		return instancia;
	}
}
