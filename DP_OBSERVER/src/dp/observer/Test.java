package dp.observer;

public class Test {
 public static void main(String[] args) {
	Observable observable=new ObservableImpl();
	Observer o1=new ObserverImp1();
	Observer o2=new ObserverImp2();
	observable.subscribe(o1);
	observable.subscribe(o2);
	observable.subscribe(new Observer() {
		
		@Override
		public void update(Observable observable) {
			System.out.println("observateur anonyme pour le test");
			
		}
	});
	
	observable.subscribe(observable2 ->System.out.println("observateur anonyme2 pour le test"));
	
	((ObservableImpl)observable).setState(100);
	((ObservableImpl)observable).setState(200);
	
	
}
}
