public class Array {
  public static void main(String[] args){
    int[] myNum = {10, 15, 20, 25};
    String[] colors = {"black", "pink", "purple", "red"};

    String[] animals = {"Dog", "Cat", "Bird"};
    System.out.println(animals[0]); //  Dog
    System.out.println(animals.length); //  3
    for (int i = 0; i < animals.length; i++) {
      System.out.println(animals[i]); // dog cat bird
    }
    // or
    for (String i : animals) {
      System.out.println(i); // dog cat bird
    }
  }
}
