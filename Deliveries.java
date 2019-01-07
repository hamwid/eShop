//Deliveries.java

import java.util.ArrayList;

public class Deliveries {
  public static ArrayList<Delivery> completedDeliveries = new ArrayList<Delivery>();
  public static ArrayList<Delivery> ongoingDeliveries = new ArrayList<Delivery>();
  public static ArrayList<Delivery> queuedDeliveries = new ArrayList<Delivery>();

  public void addEntry(Purchase p){
    Delivery d = new Delivery();
    d.createEntry(p);
    queuedDeliveries.add(d);
  }
  public void sendEntry(int i){
    queuedDeliveries.get(i).setOngoing();
    ongoingDeliveries.add(queuedDeliveries.get(i));
    queuedDeliveries.remove(i);
  }
  public void completeEntry(int i){
    queuedDeliveries.get(i).setCompleted();
    completedDeliveries.add(ongoingDeliveries.get(i));
    ongoingDeliveries.remove(i);
  }
  public ArrayList<Delivery> getCompleted(){
    return completedDeliveries;
  }
  public ArrayList<Delivery> getongoing(){
    return ongoingDeliveries;
  }
  public ArrayList<Delivery> getQueued(){
    return queuedDeliveries;
  }
}
