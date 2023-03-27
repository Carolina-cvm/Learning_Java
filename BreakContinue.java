public class BreakContinue{
  public static void main(String[] args){

    // BREAK  stops the loop when i is equal to 4
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i); // 0 1 2 3
    }

    // CONTINUE skips the value of 4
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i); // 0 1 2 3 5 6 7 8 9
    }
  }
}
