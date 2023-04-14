import java.util.HashMap; // import

public class Main {
  public static void main(String[] args) {
    HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
    // adicionar item (nome, idade)
    pessoa.put("Maria", 15);
    pessoa.put("Joao", 13);
    pessoa.put("Ana", 21);
    pessoa.put("Pedro", 18);
    System.out.println(pessoa); 
    // acessar item
    System.out.println(pessoa.get("Ana"));
    // remover item
    pessoa.remove("Pedro");
    // remover todos os itens
    pessoa.clear();
    // num de elementos
    System.out.println(pessoa.size());

    for (String i : pessoa.keySet()) {
      System.out.println("Nome: " + i + " Idade: " + pessoa.get(i));
    }
  }
}
