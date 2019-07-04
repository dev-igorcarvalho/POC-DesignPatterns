package chainOfResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private Double valor;
	private List<Item> itens;

	public Orcamento() {
		this.itens = new ArrayList<Item>();
		this.valor = 0d;
	}

	public Double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		this.itens.add(item);
		this.valor += item.getValor();
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}

}
