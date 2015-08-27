package br.com.alura.exercicio1;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteECincoPorcento()),
    TESTER(new QuinzeOuVinteECincoPorcento());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
