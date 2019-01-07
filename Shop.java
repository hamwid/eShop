//Shop.java

public class Shop {
  private Customers cList = new Customers();
  private Products pList  = new Products();

  public void createCustomer(String firstName, String lastName,
                             String address, String number){
    cList.addEntry(firstName, lastName, address, number);
  }
  public void createProduct(String name, String producer, double price){
    pList.addEntry(name, producer, price);
  }

  public static void main(String[] args){
    Shop eShop = new Shop();
    eShop.createCustomer("Hampus", "Widell", "HomeRoad", "0701");
    eShop.createCustomer("Anna",   "Bell",   "MyStreet", "0704");
    eShop.createProduct("Bike: Bounce", "Peak", 1500);
    eShop.createProduct("Bike: Slim",   "Peak", 2500);

    for(int i=0;i<eShop.cList.getEntries().size();i++){
      System.out.println(
          "Name: "+ eShop.cList.getEntries().get(i).firstName + " " +
                    eShop.cList.getEntries().get(i).lastName + "\n" +
          "Address: " + eShop.cList.getEntries().get(i).address + " " +
          "Number: "  + eShop.cList.getEntries().get(i).number);
    }
    for(int i=0;i<eShop.pList.getEntries().size();i++){
      System.out.println(
          "Name: "  + eShop.pList.getEntries().get(i).name + " " +
          "Prod.: " + eShop.pList.getEntries().get(i).producer + ", " +
          "Price: " + eShop.pList.getEntries().get(i).price + "kr");
    }
  }
}
