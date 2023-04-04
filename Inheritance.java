class Veiculo {
  protected String marca = "Ford";
  public void motor() {
    System.out.println("Vrum, Vrum!");
  }
}

class Carro extends Veiculo {
  private String modeloNome = "Mustang";
  public static void main(String[] args) {
    Carro meuCarro = new Carro();
    meuCarro.motor();
    System.out.println(meuCarro.marca + " " + meuCarro.modeloNome);
  }
}
