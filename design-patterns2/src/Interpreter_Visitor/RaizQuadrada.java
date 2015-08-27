package Interpreter_Visitor;

public class RaizQuadrada implements Expressao{

		private Expressao numero;

		public RaizQuadrada(Expressao numero) {
			this.numero = numero;
		}
		
		@Override
		public int avalia() {
			return (int)Math.sqrt(numero.avalia());
		}

		@Override
		public void aceita(Visitor visitor) {
			// TODO Auto-generated method stub
			
		}	

}
