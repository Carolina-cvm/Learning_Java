class Animal {
  public void animalSom() {
    System.out.println("Cada animal faz um som, qual o som de um porco e de um cachorro?");
  }
}

class Porco extends Animal {
  public void animalSom() {
    System.out.println("Ronc ronc");
  }
}

class Cachorro extends Animal {
  public void animalSom() {
    System.out.println("Au au");
  }
}

class Main {
  public static void main(String[] args) {
    Animal meuAnimal = new Animal();
    Animal meuPorco = new Porco();
    Animal meuCachorro = new Cachorro();
        
    meuAnimal.animalSom();
    meuPorco.animalSom();
    meuCachorro.animalSom();
  }
}
