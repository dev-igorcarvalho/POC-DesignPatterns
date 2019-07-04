package strategy;

public class Icms implements IImposto {

	@Override
	public Double calculaImposto(Orcamento orcamento) {
		System.out.println("Retornando : " + toString());
		return orcamento.getValor() * 0.1;
	}

	@Override
	public String toString() {
		return "Icms";
	}
}
