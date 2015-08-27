package flyweight;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	static {
		notas.put("do", new Do());
		notas.put("doSus", new DoSus());
		notas.put("re", new Re());
		notas.put("reSus", new ReSus());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("faSus", new FaSus());
		notas.put("sol", new Sol());
		notas.put("solSus", new SolSus());
		notas.put("la", new La());
		notas.put("laSus", new LaSus());
		notas.put("si", new Si());
	}

	public Nota pega(String nome) {
		return notas.get(nome);
	}
}
