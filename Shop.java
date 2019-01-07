//Shop.java

public class Shop {
  public static void main(String[] args){
    Customers cList = new Customers();
    cList.addEntry("Hampus", "Widell", "HomeRoad", "0701");
    cList.addEntry("Anna",   "Bell",   "MyStreet", "0704");
    Products pList  = new Products();
    pList.addEntry("Bike: Bounce", "Peak", 1500);
    pList.addEntry("Bike: Slim",   "Peak", 2500);

    for(int i=0;i<cList.getEntries().size();i++){
      System.out.println(
          "Name: "+ cList.getEntries().get(i).firstName + " " +
                    cList.getEntries().get(i).lastName + "\n" +
          "Address: " + cList.getEntries().get(i).address + " " +
          "Number: "  + cList.getEntries().get(i).number);
    }
    for(int i=0;i<pList.getEntries().size();i++){
      System.out.println(
          "Name: "  + pList.getEntries().get(i).name + " " +
          "Prod.: " + pList.getEntries().get(i).producer + ", " +
          "Price: " + pList.getEntries().get(i).price + "kr");
    }
  }
}
