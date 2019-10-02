package strategy;

public class Context {
	
	 protected IStrategy strategy;
	 
  public void appliquerStrategy(){
	  strategy.operationStrategy();
  }

public void setStrategy(IStrategy strategy) {
	this.strategy = strategy;
}
  
}
