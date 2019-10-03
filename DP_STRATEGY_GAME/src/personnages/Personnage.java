package personnages;

import strategies.ComportementArme;

public abstract class Personnage {
	protected String nom;
	protected int score;
	protected ComportementArme comportementArme;
	
	public void setComportementArme(ComportementArme comportementArme) {
		this.comportementArme = comportementArme;
	}

	public abstract void combattre();
}
