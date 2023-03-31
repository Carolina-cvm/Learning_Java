public class Main {
  int num;

  // class constructor
  // método especial usado para inicializar objetos, é chamado quando um objeto de uma classe é criado, pode ser usado para definir valores iniciais para atributos de objeto
  public Main() {
    num = 5;
  }

  public static void main(String[] args) {
    Main obj = new Main();
    System.out.println(obj.num + 5); // 10
  }
}
