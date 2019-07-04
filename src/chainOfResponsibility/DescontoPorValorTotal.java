package chainOfResponsibility;

public class DescontoPorValorTotal implements IDesconto {

	private IDesconto proximo;
	private Double valor;

	public DescontoPorValorTotal(Double valor) {
		this.valor = valor;
	}

	public DescontoPorValorTotal(IDesconto proximo, Double valor) {
		this.proximo = proximo;
		this.valor = valor;
	}

	@Override
	public Double retornaValorDesconto(Orcamento orcamento) {
		if (orcamento.getValor() > valor) {
			System.out.println("Retornando " + toString());
			return orcamento.getValor() * 0.1;
		} else if (proximo != null) {
			System.out.println("Chamando proximo - " + proximo.toString());
			return proximo.retornaValorDesconto(orcamento);
		} else {
			System.out.println("Desconto não aplicavel");
			return 0D;
		}
	}

	@Override
	public String toString() {
		return "DescontoPorValorTotal";
	}

}
