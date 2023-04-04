class ClassExterna {
  int x = 10;

  class ClassInterna {
    int y = 25;
  }
}

public class Main {
  public static void main(String[] args) {
    ClassExterna numExterno = new ClassExterna();
    ClassExterna.ClassInterna numInterno = numExterno.new ClassInterna();
    System.out.println(numInterno.y + numExterno.x); // 25 + 10 = 35
  }
}
