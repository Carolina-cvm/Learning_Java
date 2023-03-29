public class Recursion {
  public static void main(String[] args) {
    int resultado = sum(10);
    System.out.println(resultado);
    // int resultado= sum(5, 10);
    // System.out.println(resultado);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1); // 10 + sum(9), 10 + (9+sum(8))
    } else {
      return 0;
    }
  }
  /*
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
  */
}
