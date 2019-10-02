package strategy;

public class Application {

	public static void main(String[] args) {
		Context ctx=new Context();
		
		ctx.setStrategy(new StrategyImp1());
		ctx.appliquerStrategy();
		ctx.setStrategy(new StrategyImp2());
		ctx.appliquerStrategy();
		ctx.setStrategy(new StrategyImp3());
		ctx.appliquerStrategy();


	}

}
