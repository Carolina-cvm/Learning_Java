interface Animal {
  public void animalSom(); // interface method 
  public void dormir(); // interface method
}

class Gato implements Animal {
  public void animalSom() {
    System.out.println("Miau Miau");
  }
  public void dormir() {
    System.out.println("Zzz..");
  }
}

class Main {
  public static void main(String[] args) {
    Gato meuGato = new Gato();
    meuGato.animalSom();
    meuGato.dormir();
  }
}
