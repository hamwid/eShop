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
    if(completed){
      System.out.println("Completed!");
    } else if(queued){
      System.out.println("Queued!");
    } else {
      System.out.println("Error!");
    }
  }
}
