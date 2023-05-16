public class Overloading {
  static int conta(int x, int y) {
    return x + y;
  }
  
  static double conta(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    int number1 = conta(12, 10);
    double number2 = conta(2.25, 9.30);
    System.out.println("Conta int: " + number1);
    System.out.println("Conta double: " + number2);
  }
}
