package entites;

public class ProdutoImportado extends Produto {
	private Double taxa;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}
	public Double total() {
		return super.getPreco()+taxa;
	}
	@Override
	public String etiqueta() {
		return super.getNome()+" $ "+String.format("%.2f", total())
		+" (taxa: $ "+String.format("%.2f", taxa)+")";
	}
}
