package strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		IImposto iss = new Iss();
		IImposto icsm = new Icms();
		Orcamento orcamento = new Orcamento(1000D);
		CalculadorImposto calculador = new CalculadorImposto();

		System.out.println(calculador.calcularImposto(orcamento, iss));
		System.out.println(calculador.calcularImposto(orcamento, icsm));

	}

}
