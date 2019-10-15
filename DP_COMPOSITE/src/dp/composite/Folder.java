package dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant {
	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private List<Composant> composants=new ArrayList<>();
	

	@Override
	public void afficher() {
		
		String tab=indentation();
		System.out.println(tab+"Folder: " +name);
		
		for(Composant c:composants){
			c.afficher();
		}
	}
	public Composant addComposants(Composant composant){
		
		composant.level=this.level+1;
		this.composants.add(composant);
		return composant;
	}

}
