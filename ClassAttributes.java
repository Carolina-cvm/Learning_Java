public class Main {
  String firstName = "Ana";
  String lastName = "Silva";
  int age = 21;

  int num = 150;
  
  public static void main(String[] args) {
    Main myObj1 = new Main();
    System.out.println("Full Name: " + myObj1.firstName + " " + myObj1.lastName);
    System.out.println("Age: " + myObj1.age);

    Main myObj2 = new Main();
    myObj2.num = 50;
    System.out.println(myObj2.num); // 50
  }
}
