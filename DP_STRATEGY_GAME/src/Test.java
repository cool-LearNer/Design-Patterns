import personnages.Personnage;
import personnages.Reine;
import strategies.ComportementPoignard;

public class Test {
  public static void main(String[] args) {
	Personnage reine=new Reine();
	reine.combattre();
	Personnage roi=new Reine();
	roi.combattre();
	System.out.println("-------------");
	roi.setComportementArme(new ComportementPoignard());
	roi.combattre();
}
}
