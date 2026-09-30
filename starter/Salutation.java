// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.
public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("user"));
  }

  static String saluer(String nom) {
    // Fonction pour saluer un camarade en patoi belge.
    return "Salut camarade " + nom + ", à tantot !";
  }
}
