package chainOfResponsibility;

public class DescontoPorQuantidadeItens implements IDesconto {

	private IDesconto proximo;
	private Integer quantidade;

	public DescontoPorQuantidadeItens(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public DescontoPorQuantidadeItens(Integer quantidade, IDesconto proximo) {
		this.proximo = proximo;
		this.quantidade = quantidade;
	}

	@Override
	public Double retornaValorDesconto(Orcamento orcamento) {
		if (orcamento.getItens().size() > quantidade) {
			System.out.println("Retornando " + toString());
			return orcamento.getValor() * 0.05;
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
		return "DescontoPorQuantidadeItens";
	}
	
	

}
