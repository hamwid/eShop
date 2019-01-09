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
    System.out.println("**** Queued deliveries *****");
    for(int i=0;i<eShop.dList.getQueued().size();i++){
      eShop.dList.getQueued().get(i).print();
      System.out.print('\n');
    }
    System.out.println("****************************\n");
    System.out.println("**** Ongoing deliveries ****");
    for(int i=0;i<eShop.dList.getongoing().size();i++){
      eShop.dList.getongoing().get(i).print();
      System.out.print('\n');
    }
    System.out.println("****************************\n");
    System.out.println("*** Completed deliveries ***");
    for(int i=0;i<eShop.dList.getCompleted().size();i++){
      eShop.dList.getCompleted().get(i).print();
      System.out.print('\n');
    }
    System.out.println("****************************\n");
  }

  public static void main(String[] args){
    Shop eShop = new Shop();

    //Create two customers
    eShop.createCustomer("Hampus", "Widell", "HomeRoad", "0701");
    eShop.createCustomer("Anna",   "Bell",   "MyStreet", "0704");

    //Create two products
    eShop.createProduct("Bike: Bounce", "Peak", 1500);
    eShop.createProduct("Bike: Slim",   "Peak", 2500);

    //"Hampus Widell" order one instance of each product
    eShop.createPurchase(eShop.cList.getEntries().get(0),
                         eShop.prList.getEntries().get(0));
    eShop.createPurchase(eShop.cList.getEntries().get(0),
                         eShop.prList.getEntries().get(1));
    //"Anna Bell" order two instances of "Bike: Slim"
    eShop.createPurchase(eShop.cList.getEntries().get(1),
                         eShop.prList.getEntries().get(1));
    eShop.createPurchase(eShop.cList.getEntries().get(1),
                         eShop.prList.getEntries().get(1));

    //Each purchase gets placed in the delivery-queue
    eShop.createDelivery(eShop.puList.getEntries().get(0));
    eShop.createDelivery(eShop.puList.getEntries().get(1));
    eShop.createDelivery(eShop.puList.getEntries().get(2));
    eShop.createDelivery(eShop.puList.getEntries().get(3));

    //Send "Bike: Bounce" to "Hampus Widell", and remove from queue
    eShop.dList.sendEntry(0);
    //Send "Bike: Slim" to "Hampus Widell", and remove from queue
    eShop.dList.sendEntry(0);
    //Send "Bike: Slim" to "Anna Bell", and remove from queue
    eShop.dList.sendEntry(0);
    //  Second order of "Bike: Slim" from "Anna Bell" can't be sent
    //  Item out of stock!

    //"Bike: Bounce" is delivered to "Hampus Widell"
    eShop.dList.completeEntry(0);

    eShop.printAllDeliveries(eShop);
  }
}
