/** 
Represents a street address. Doesn't indicate that the Address class is apart of a Student object. 

See UML for visual Representation of Aggregation Class. 
**/
public class Address{
  private String streetAddress;
  private String city;
  private String state;
  private long zipCode;

  public Address(String streetAdress, String city, String state, long zipCode) {
    this.streetAddress = streetAdress;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public String toString() {
    return streetAddress + " " + city + ", " + state + " " + zipCode;
  }
}