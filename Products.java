//Products.java

import java.util.ArrayList;

public class Products {
  public static ArrayList<Product> productList = new ArrayList<Product>();

  public void addEntry(String name, String producer,
                       double price){
    Product p = new Product();
    p.createEntry(name, producer, price);
    productList.add(p);
  }
  public ArrayList<Product> getEntries(){
    return productList;
  }
}
