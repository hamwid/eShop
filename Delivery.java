//Delivery.java

public class Purchase {
  public Purchase purchase;
  public boolean queued;
  public boolean completed;

  public void createEntry(Purchase p){
    purchase = p;
    queued = true;
    completed = false;
  }
}
