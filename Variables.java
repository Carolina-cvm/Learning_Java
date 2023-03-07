/*
String = "Olá"
int = 123 ou -123
float = 19,99 ou -19,99
char =  'a' ou 'B'
boolean = true ou false
*/

public class Variables {
  public static void main(String[] args){
    String myName = "Carol";
    System.out.println(myName);

    int myAge;
    myAge = 21;
    System.out.println(myAge);
    final int myNumber = 50; // constante
    System.out.println(myNumber);

    float myFloatNum = 15.99f;
    System.out.println(myFloatNum);
    char myLetter = 'C';
    System.out.println(myLetter);
    boolean myBool = true;
    System.out.println(myBool);

    String firstName = "Ana ";
    String lastName = "Silva";
    String completeName = firstName + lastName; 
    System.out.println(completeName);
    // System.out.println(firstName + lastName);

    int x = 10;
    int y = 5;
    int z = 2;
    int result = x + y + z;
    System.out.println(result);
    
    int a = 20, b = 15, c = 10;
    System.out.println(a + b + c);

    int d, e, f;
    d = e = f = 50;
    System.out.println(d + e + f);
  }
}
