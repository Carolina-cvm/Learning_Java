public class String {
  public static void main(String[] args) {
    String greeting = "Hello World";
    System.out.println(greeting);
    System.out.println(greeting.length());
    System.out.println(greeting.toUpperCase());  // caixa alta 
    System.out.println(greeting.toLowerCase()); // caixa baixa
    System.out.println(greeting.indexOf("World")); // outputs 6

    String firstName = "Juca";
    String lastName = "Silva";
    System.out.println(firstName.concat(lastName));
  }
}
