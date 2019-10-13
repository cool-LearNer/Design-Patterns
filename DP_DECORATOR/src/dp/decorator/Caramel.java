package dp.decorator;

public class Caramel extends DecorateurAbstrait {

	public Caramel(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.7+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+" au Caramel";
	}

}
