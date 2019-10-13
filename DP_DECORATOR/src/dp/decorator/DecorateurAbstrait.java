package dp.decorator;

public abstract class DecorateurAbstrait extends Boisson{
	// pour qu'un decorateur puisse decorer un autre decorateur
	protected Boisson boisson;

	public DecorateurAbstrait(Boisson boisson) {
		super();
		this.boisson = boisson;
	}
	
	public abstract String getDescription();
	
	
	

}
