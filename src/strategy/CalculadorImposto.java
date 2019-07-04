package strategy;

public class CalculadorImposto {

	public Double calcularImposto (Orcamento orcamento, IImposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}
