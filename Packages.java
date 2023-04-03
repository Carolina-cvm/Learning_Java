package mypack; // package
import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String name;
    
    System.out.println("Enter username"); 
    name = obj.nextLine();   
       
    System.out.println("Username is: " + name);        
  }
}
