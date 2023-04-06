import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Digite seu nome e sua idade:");

    String nome = obj.nextLine();
    int age = obj.nextInt();

    System.out.println("Olá" + nome + "tudo bem?");  
  }
}
