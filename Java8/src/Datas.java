import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate data = LocalDate.now();
		System.out.println(formatador.format(data));
		
		LocalDate novaData = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(formatador.format(novaData));
		
		Period periodo = Period.between(data, novaData);
		System.out.println(periodo);
	}
}
