package entities;

public abstract class Entidade {

	protected Long id;
	
	public Entidade (Long id) {
		this.id = id;
	}
	
	public abstract Long getId();
}
