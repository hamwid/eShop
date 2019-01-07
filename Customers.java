//Customers.java

import java.util.ArrayList;

public class Customers {
  public static ArrayList<Customer> customerList = new ArrayList<Customer>();

  public void addEntry(String firstname, String lastname,
                       String address,   String number){
    Customer c = new Customer();
    c.createEntry(firstname, lastname, address, number);
    customerList.add(c);
  }
  public ArrayList<Customer> getEntries(){
    return customerList;
  }
}
