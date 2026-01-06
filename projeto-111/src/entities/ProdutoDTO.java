package entities;

public class ProdutoDTO extends Produto implements Dto {

	public ProdutoDTO(Long id, String nome, Double preco) {
		super(id, nome, preco);
	}
}
