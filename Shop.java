//Shop.java

public class Shop {
  private Customers  cList  = new Customers();
  private Products   prList = new Products();
  private Purchases  puList = new Purchases();
  private Deliveries dList  = new Deliveries();

  public void createCustomer(String firstName, String lastName,
                             String address, String number){
    cList.addEntry(firstName, lastName, address, number);
  }
  public void createProduct(String name, String producer, double price){
    prList.addEntry(name, producer, price);
  }
  public void createPurchase(Customer customer, Product product){
    puList.addEntry(customer, product);

  }
  public void createDelivery(Purchase purchase){
    dList.addEntry(purchase);
  }

  public void printAllCustomers(Shop eShop){
    for(int i=0;i<eShop.cList.getEntries().size();i++){
      eShop.cList.getEntries().get(i).print();
    }
  }
  public void printAllProducts(Shop eShop){
    for(int i=0;i<eShop.prList.getEntries().size();i++){
      eShop.prList.getEntries().get(i).print();
    }
  }
  public void printAllPurchases(Shop eShop){
    for(int i=0;i<eShop.puList.getEntries().size();i++){
      eShop.puList.getEntries().get(i).print();
      System.out.print('\n');
    }
  }
  public void printAllDeliveries(Shop eShop){
    for(int i=0;i<eShop.dList.getQueued().size();i++){
      eShop.dList.getQueued().get(i).print();
      System.out.print('\n');
    }
  }

  public static void main(String[] args){
    Shop eShop = new Shop();
    eShop.createCustomer("Hampus", "Widell", "HomeRoad", "0701");
    eShop.createCustomer("Anna",   "Bell",   "MyStreet", "0704");
    eShop.createProduct("Bike: Bounce", "Peak", 1500);
    eShop.createProduct("Bike: Slim",   "Peak", 2500);
    eShop.createPurchase(eShop.cList.getEntries().get(0),
                         eShop.prList.getEntries().get(0));
    eShop.createPurchase(eShop.cList.getEntries().get(1),
                         eShop.prList.getEntries().get(0));

    eShop.createDelivery(eShop.puList.getEntries().get(0));
    eShop.printAllDeliveries(eShop);
  }
}
