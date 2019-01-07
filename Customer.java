//Customer.java

public class Customer {
  public String firstName;
  public String lastName;
  public String address;
  public String number;

  public void setFirstName(String input){
    firstName = input;
  }
  public void setLastName(String input){
    lastName = input;
  }
  public void setAddress(String input){
    address = input;
  }
  public void setNumber(String input){
    number = input;
  }
  public void createEntry(String inputFirstName, String inputLastName,
                          String inputAddress, String inputNumber){
    setFirstName(inputFirstName);
    setLastName(inputLastName);
    setAddress(inputAddress);
    setNumber(inputNumber);
  }
  public void print(){
    System.out.println(firstName + " " + lastName + ", " +
                       address   + " " + number);
  }

}
