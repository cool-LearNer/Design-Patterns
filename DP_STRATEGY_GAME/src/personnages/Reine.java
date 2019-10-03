package personnages;

import strategies.ComportementArcEtFleche;

public class Reine extends Personnage{

	public Reine() {
		this.comportementArme= new ComportementArcEtFleche();
	}

	@Override
	public void combattre() {
		System.out.println("je suis une reine");
		this.comportementArme.utiliserArme();
		
	}

}
