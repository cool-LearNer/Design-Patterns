package dp.decorator;

public class Test {

	public static void main(String[] args) {
		Boisson boisson=new Espresso();
		System.out.println("********************");
		System.out.println(boisson.getDescription());
		System.out.println(boisson.cout());
		System.out.println("********************");
		boisson=new Chocolat(boisson);
		System.out.println(boisson.getDescription());
		System.out.println(boisson.cout());
		System.out.println("********************");
		
		
		

	}

}
