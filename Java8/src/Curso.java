import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

class TestaCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// cursos.stream().sorted(Comparator.comparingInt(Curso::getAlunos)).forEach(s
		// -> System.out.println(s.getNome()));
		cursos.stream()
				.filter(quantidade -> quantidade.getAlunos() > 50)
				.forEach(
						s -> System.out.println(s.getNome() + ": "
								+ s.getAlunos()));

		Stream<String> nome = cursos.stream().map(Curso::getNome);
		// ou: Stream<String> nome1 = cursos.stream().map(s -> s.getNome());

		/*
		 * cursos.stream().filter(c -> c.getAlunos() > 50).findFirst()
		 * .map(Curso::getAlunos);
		 * 
		 * Optional<Curso> teste = cursos.stream().filter(c -> c.getAlunos() >
		 * 50) .findFirst();
		 * 
		 * teste.ifPresent(c -> System.out.println(c.getNome()));
		 * 
		 * cursos.stream().mapToInt(c -> c.getAlunos()).average();
		 */

		Stream<Curso> stream = cursos.stream().filter(c -> c.getAlunos() > 50);
		List<Curso> cursosList = stream.collect(Collectors.toList());
	}
}