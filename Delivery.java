//Delivery.java

public class Delivery {
  public Purchase purchase;
  public boolean queued;
  public boolean completed;

  public void createEntry(Purchase p){
    purchase = p;
    queued = true;
    completed = false;
  }
}
