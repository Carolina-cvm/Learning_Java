public class Math {
  public static void main(String[] args) {
    System.out.println(Math.max(150, 200)); // encontra o maior valor
    
    System.out.println(Math.min(25, 15)); // encontra o menor valor
    
    System.out.println(Math.random()); // numero aleatorio
    int randomNumero = (int)(Math.random() * 51);  // de 0 a 50
    System.out.println(randomNumero);
  }
}
