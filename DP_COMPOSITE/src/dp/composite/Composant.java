package dp.composite;

public abstract class Composant {
	protected String name; // protected: pour pouvoir l'utiliser dansles classes d�riv�es
	protected int level;// pour garder le niveau d'hi�rarchie
	
	public Composant(String name) {
		this.name=name;
	}
	
    public abstract void afficher();
    
    public String indentation(){
    	String str="";
    	for (int i = 0; i < level; i++) {
			str+="\t";
		}
    	return str;
    }
}
