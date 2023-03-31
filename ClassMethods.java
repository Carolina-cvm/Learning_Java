public class Main {
  // Static 
  static void staticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public 
  public void publicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main 
  public static void main(String[] args) {
    staticMethod(); // call the static method

    Main obj = new Main(); // create an object
    obj.publicMethod(); // call the public method
  }
}
