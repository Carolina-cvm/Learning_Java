// abstract class
abstract class Animal {
  // abstract method
  public abstract void animalSom();
  public void dormir() {
    System.out.println("Zzz...");
  }
}

// subclass
class Gato extends Animal {
  public void animalSom() {
    System.out.println("Miau Miau");
  }
}

class Main {
  public static void main(String[] args) {
    Gato meuGato = new Gato();
    meuGato.animalSom();
    meuGato.dormir();
  }
}
