/** Demonstrates the use of an aggregate class 
StudentBody class creates two Student objects composed in part of two Address objects, one for the student's address at school and another for the student's home address. 
  **/
public class StudentBody{
  //Create some Address and Student objects and prints them. 
  public static void main(String [] args)
  {
    Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
    Address jHome = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
    Student john = new Student("John" , "Smith", jHome, school);

    Address mhome = new Address("3500 John A Merritt Blvd", "Nashville", "TN", 37209);
    Student marsha = new Student ("Marsha", "Jones", mhome, school);

    //invokes the toString() to create valid representation
    System.out.println(john); 
    System.out.println();
    //invokes the toString() to create valid representation 
    System.out.println(marsha);
  }
}