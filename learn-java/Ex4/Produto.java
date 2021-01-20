
public class Produto {

	private int codigo;
	private String lanche;
	private double preco;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLanche() {
		return lanche;
	}
	public void setLanche(String lanche) {
		this.lanche = lanche;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto(int codigo, String lanche, double preco) {
		super();
		this.codigo = codigo;
		this.lanche = lanche;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return codigo + " - " + lanche + " R$ " + preco;
	}
	
}
