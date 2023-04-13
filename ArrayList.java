import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cores = new ArrayList<String>(); // cria o array
    // adicionar item
    cores.add("Preto");
    cores.add("Vermelho");
    cores.add("Marrom");
    cores.add("Rosa");
    System.out.println(cores);
    // acessar item
    System.out.println(cores.get(0));
    // alterar item
    cores.set(1, "Amarelo");
    // remover item
    cores.remove(2);
    // remove todos os itens do array
    cores.clear();
    // num de elementos no array
    System.out.println(cores.size());
  } 
}
