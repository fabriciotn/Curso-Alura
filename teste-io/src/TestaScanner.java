import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		// InputStream is = System.in;
		Scanner sc = new Scanner(is);

		PrintStream ps = new PrintStream("saida.txt");

		while (sc.hasNextLine()) {
			ps.println(sc.nextLine());

		}

		sc.close();
		ps.close();
	}
}
