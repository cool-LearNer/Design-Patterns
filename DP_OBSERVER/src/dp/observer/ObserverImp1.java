package dp.observer;

public class ObserverImp1 implements Observer{

	@Override
	public void update(Observable observable) {
		int state=((ObservableImpl)observable).getState();
		double res=state*state;
		System.out.println("**** ObserverImp1 ****");
		System.out.println("Mise à jour du state : nouvelle valeur= "+state);
		System.out.println("resultat du traitement effectué en utilisant"
				+ "la nouvelle valeur est =  "+res);
		System.out.println("**********************");
		
		
	}

}
