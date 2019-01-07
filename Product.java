//Product.java

public class Product {
  public String name;
  public String producer;
  public double price;

  public void setName(String input){
    name = input;
  }
  public void setProducer(String input){
    producer = input;
  }
  public void setPrice(double input){
    price = input;
  }
  public void createEntry(String inputName, String inputProducer,
                          double inputPrice){
    setName(inputName);
    setProducer(inputProducer);
    setPrice(inputPrice);
  }
}
