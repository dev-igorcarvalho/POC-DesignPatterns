package strategy;

public class Iss implements IImposto {

	@Override
	public Double calculaImposto(Orcamento orcamento) {
		System.out.println("Retornando : " + toString());
		return orcamento.getValor() * 0.06;
	}

	@Override
	public String toString() {
		return "Iss";
	}

	
}
