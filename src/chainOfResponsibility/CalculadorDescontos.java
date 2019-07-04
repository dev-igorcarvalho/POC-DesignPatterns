package chainOfResponsibility;

public class CalculadorDescontos {
	public Double caculaDesconto (Orcamento orcamento) {
		IDesconto d1 = new DescontoPorQuantidadeItens(5, new DescontoPorValorTotal(100D));
		return d1.retornaValorDesconto(orcamento);
	}
}
