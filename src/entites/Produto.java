package entites;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto() {
		}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public String etiqueta() {
		return nome +" $ "+ String.format("%.2f", getPreco());
	}
}
