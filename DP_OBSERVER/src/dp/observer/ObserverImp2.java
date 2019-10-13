package dp.observer;

public class ObserverImp2 implements Observer {

	@Override
	public void update(Observable observable) {
		int state=((ObservableImpl)observable).getState();
		double res=state+1;
		System.out.println("**** ObserverImp2 ****");
		System.out.println("Mise à jour du state : nouvelle valeur= "+state);
		System.out.println("resultat du traitement effectué en utilisant"
				+ "la nouvelle valeur est =  "+res);
		System.out.println("**********************");

	}

}
