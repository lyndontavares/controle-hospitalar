
public class PedidoItem {

	Produto produto;
	int quantidade;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public PedidoItem(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		//  1 - Cachorro-Quente R$ 4.0 X 1
		return  produto.toString() + " X "+ quantidade ;
	}

}
