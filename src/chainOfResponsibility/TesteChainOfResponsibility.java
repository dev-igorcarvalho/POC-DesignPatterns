package chainOfResponsibility;

public class TesteChainOfResponsibility {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		for (int i = 1; i < 7; i++) {
			Item item = new Item("item "+i, 100D*2);
			orcamento.adicionaItem(item);
		}
		
		Double descontoFinal = new CalculadorDescontos().caculaDesconto(orcamento);
		System.out.println("Desconto de : " + descontoFinal);

	}

}
