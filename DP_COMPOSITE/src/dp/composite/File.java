package dp.composite;

public class File extends Composant{

	public File(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficher() {
		String tab=indentation();
		System.out.println(tab+"File: " +name);
		
	}


}
