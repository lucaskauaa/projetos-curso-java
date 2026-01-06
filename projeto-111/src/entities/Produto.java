package entities;

public class Produto extends Entidade {

	private String nome;
	private Double preco;
	
	public Produto (Long id, String nome, Double preco) {
		super(id);
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco () {
		return preco;
	}
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString () {
		return "\nId: " + id + "\nNome: " + nome + "\nPreço: R$" + preco;
	}
}
