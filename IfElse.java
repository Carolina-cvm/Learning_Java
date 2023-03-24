public class IfElse{
  public static void main(String[] args) {
    // IF ELSE
    int x = 20;
    int y = 15;
    if (x > y) {
    System.out.println("x é maior que y");
    } else {
    System.out.println("y é maior que x");
    }

    // ELSE IF
    int hora = 22;
    if (hora < 10) {
    System.out.println("Bom dia.");
    } else if (hora < 18) {
    System.out.println("Boa tarde.");
    } else {
    System.out.println("Boa noite.");
    }

    // short if else
    int horario = 20;
    String msg = (horario < 18) ? "Boa dia." : "Boa noite.";
    System.out.println(msg);
  }
}
