//Purchases.java

import java.util.ArrayList;

public class Purchases {
  public static ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();

  public void addEntry(Customer customer, Product product){
    Purchase p = new Purchase();
    p.createEntry(customer, product);
    purchaseList.add(p);
  }
  public ArrayList<Purchase> getEntries(){
    return purchaseList;
  }
}
