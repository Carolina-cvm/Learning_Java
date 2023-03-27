public class ForLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i); // 1 2 3 4 5 6 7 8 9
    }

    // for each
    String[] colors = { "Black", "Purple", "Red", "Pink" };
    for (String i : colors) {
      System.out.println(i);
    }
  }
}
