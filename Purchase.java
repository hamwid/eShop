//Purchase.java

public class Purchase {
  public Customer customer;
  public Product  product;

  public void setCustomer(Customer c){
    customer = c;
  }

  public void setProduct(Product p){
  product = p;
  }

  public void createEntry(Customer c, Product p){
    setCustomer(c);
    setProduct(p);
  }
}
