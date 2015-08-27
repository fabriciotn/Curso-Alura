package br.com.xstream;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.SingleValueConverter;

public class PrecoConverter implements SingleValueConverter {

	@Override
	public boolean canConvert(Class arg0) {
		return arg0.isAssignableFrom(Double.class);
	}

	@Override
	public Object fromString(String valor) {
		NumberFormat formatador = formatador();
		try {
			return formatador.parse(valor);
		} catch (ParseException e) {
			throw new ConversionException("Não foi possível converter " + valor, e);
		}
	}

	@Override
	public String toString(Object object) {
		Double valor = (Double) object;
		NumberFormat formatador = formatador();
	    String valorEmReais = formatador.format(valor);
		return valorEmReais;
	}

	private NumberFormat formatador() {
		Locale brasil = new Locale("pt","br");
	    NumberFormat formatador = NumberFormat.getCurrencyInstance(brasil);
		return formatador;
	}

}
