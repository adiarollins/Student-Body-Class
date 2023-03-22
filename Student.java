/** represents a single student, includes to references to Address objects. Refer to those objects in the toString method as we create a string representation of the student. 
**/
public class Student{
  private String firstName;
  private String lastName;
  private Address homeAddress;
  private Address schoolAddress;

  public Student (String firstName, String lastName, Address homeAddress, Address schoolAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.homeAddress = homeAddress;
    this.schoolAddress = schoolAddress;
  }

  public String toString () {
    return firstName + " " + lastName + "\nHome Address: " + homeAddress + "\nSchool Address: " + schoolAddress;
  }
}