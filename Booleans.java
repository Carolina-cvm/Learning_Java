public class Booleans{
  public static void main(String[] args) {
    // TRUE ou FALSE
    int x = 5;
    int y = 4;
    System.out.println(x > y); // true
    // System.out.println(10 > 9);
    System.out.println(x == y); // false

    int minhaIdade = 16;
    int imputabilidadePenalIdade = 18;

    if (minhaIdade >= imputabilidadePenalIdade) {
      System.out.println("penalmente imputável");
    } else {
      System.out.println("penalmente inimputável");
    }
  }
}
