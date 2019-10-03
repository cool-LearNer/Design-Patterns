package personnages;


import strategies.ComportementHache;

public class Roi extends Personnage{

	public Roi() {
		this.comportementArme= new ComportementHache();
	}

	@Override
	public void combattre() {
		System.out.println("je suis un roi ");
		this.comportementArme.utiliserArme();
		
	}
}
