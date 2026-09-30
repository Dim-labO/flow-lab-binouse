import java.time.LocalTime;

// Point de départ du TP 06.
// Chaque membre du groupe ajoute sa salutation au même endroit,
// afin de provoquer volontairement des conflits lors des Pull Requests.
public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("user"));
  }

  static String saluer(String nom) {
    LocalTime heure = LocalTime.now();

    if (heure.isBefore(LocalTime.NOON)) {
      return "Bonjour, " + nom + " !";
    } else if (heure.isBefore(LocalTime.of(18, 0))) {
      return "Bon après-midi, " + nom + " !";
    } else {
      return "Bonsoir, " + nom + " !";
    }
  }
}
