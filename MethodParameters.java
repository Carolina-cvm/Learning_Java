public class MethodParameters {
  static void nomeCompleto(String name) {
    System.out.println(name + " Silva");
  }
  
  static int contaSoma(int x, int y) {
    return x + y;
  }
  
  static int contaSubtracao(int x) {
    return x - 1;
  }
  
  public static void main(String[] args) {
    nomeCompleto("Maria");
    nomeCompleto("Joao");
    nomeCompleto("Luis");
    System.out.println(contaSoma(5, 10));
    System.out.println(contaSubtracao(10));
  }
}
