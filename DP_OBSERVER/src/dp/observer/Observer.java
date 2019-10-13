package dp.observer;

public interface Observer {
  public void update(Observable observable);
  // this is a pop model 
  //if we want to use push, we can replace "Observable observable" directly by int state
  // the the getState method( Observable implementations) will be optional
  //cause we already had the information not just the notification 
  
}
