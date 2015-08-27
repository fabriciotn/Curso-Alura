package br.com.caelum.empresa.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.empresa.modelo.Gasto;

public class FiltradorDeGastosEspeciais {
	private double limite;

	public List<Gasto> filtraGastosGrandes(List<Gasto> gastos) {
		List<Gasto> gastosAcimaDoLimite = new ArrayList<Gasto>();
		for (Gasto gasto : gastos) {
			if (gasto.getValor() >= this.limite)
				gastosAcimaDoLimite.add(gasto);
			System.out.println(gasto.getTipo());
			System.out.println(gasto.getValor());
		}
		return gastosAcimaDoLimite;
	}

	public FiltradorDeGastosEspeciais(double limite) {
		super();
		this.limite = limite;

	}

}
