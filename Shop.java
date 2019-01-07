//Shop.java

public class Shop {
  public static void main(String[] args){
    Customers cList = new Customers();
    cList.addEntry("Hampus", "Widell", "HomeRoad", "0701");
    cList.addEntry("Anna",   "Bell",   "MyStreet", "0704");
    Products pList  = new Products();
    pList.addEntry("Bike: Bounce", "Peak", 1500);
    pList.addEntry("Bike: Slim",   "Peak", 2500);
  }
}
