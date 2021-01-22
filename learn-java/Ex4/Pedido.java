import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private double total;

	private List<PedidoItem> itens;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<PedidoItem> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}


	// A D I C I O N A   I T E M   A O   P E D I D O

	public void adicionarItem( Produto produto, int quantidade) {

		//A D I C O N A   A   L I S T A   D E   I T E N S   D O   P E D I D O
		itens.add(new PedidoItem(produto, quantidade));

		// A T U A L I Z A   T O T A L   D O   P E D I D O
		total += quantidade * produto.getPreco();

	}

	@Override
	public String toString() {
		return "Pedido [total=" + total + ", itens=" + itens + "]";
	}

	// A O   C R I A R   P E D I D O
	// I N I C I A L I Z A   L I S T A   D E   I T E N S   E   I N I C I A L I Z A   T O T A L

	public Pedido() {
		super();
		total=0;
		itens = new ArrayList<PedidoItem>();
	}

}
