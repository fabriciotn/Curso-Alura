import java.io.PrintStream;

public class TestaInteger {
	
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		if(x1.equals(x2)){
			System.out.println("igual");
		}else{
			System.out.println("Diferente");
		}
		
		Integer.parseInt("10");
		
		// falta a declaração da saída
	    PrintStream saida = System.out;
	    saida.println("ola");
	}
}
