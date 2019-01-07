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
  public void print(){
    purchase.print();
  }
  public void setOngoing(){
    queued    = false;
    completed = false;
  }
  public void setCompleted(){
    queued    = false;
    completed = true;
  }
}
