package entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	private Date fabricacao;
	
	public ProdutoUsado() {
	super();
	}

	public ProdutoUsado(String nome, Double preco, Date fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}
	@Override
	public String etiqueta() {
		SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
		return super.getNome()+" (Usado) $ "+String.format("%.2f", super.getPreco())
		+" (Data de fabricação: "+d.format(fabricacao)+")";
	}
}
