package personnages;


import strategies.ComportementPoignard;

public class Troll extends Personnage{
	
	

	public Troll() {
		this.comportementArme= new ComportementPoignard();
	}

	@Override
	public void combattre() {
		System.out.println("je suis un troll");
		this.comportementArme.utiliserArme();
		
	}

}
