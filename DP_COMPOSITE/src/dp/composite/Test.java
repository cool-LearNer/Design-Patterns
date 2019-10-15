package dp.composite;

public class Test {

	public static void main(String[] args) {
		Folder root=new Folder("root");
		Folder f1=new Folder("structure");
		Folder f2=new Folder("creation");
		Folder f3=new Folder("comportement");
		
		File file1=new File("Strategy");
		File file2=new File("Composite");
		File file3=new File("Singleton");
		
		root.addComposants(f1);
		root.addComposants(f2);
		root.addComposants(f3);
		
		f1.addComposants(file2);
		f2.addComposants(file3);
		f3.addComposants(file1);		
		
		
		root.afficher();
	}
}
