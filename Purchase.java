//Purchase.java

public class Purchase {
  public Customer customer;
  public Product  product;

  public void createEntry(Customer c, Product p){
    customer = c;
    product = p;
  }
  public void print(){
    customer.print();
    product.print();
  }
}
