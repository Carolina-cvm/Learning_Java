// abstract class
abstract class Animal {
  // abstract method
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz...");
  }
}

// subclass
class Gato extends Animal {
  public void animalSound() {
    System.out.println("Miau Miau");
  }
}

class Main {
  public static void main(String[] args) {
    Gato meuGato = new Gato();
    meuGato.animalSound();
    meuGato.sleep();
  }
}
