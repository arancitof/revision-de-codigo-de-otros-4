package f271c36ea86bb0498df5d8b4ab6ab258.com.generation;

/*
 * El siguiente codigo es la representacion del juego de piedra papel o tijera,
 * mediante la linea de comandos, se le solicita a dos jugadores que elijan entre la opcion
 * piedra, papel o tijera, el codigo compara la respuesta de ambos jugadores y devuelva la respuesta 
 * de quien es el ganador
 */


//Falto importar la clase Scanner
import java.util.Scanner;

public class Codigo4 {
  // Faltaba el metodo main
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);// Falaba de donde se iba a leer

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    //Error en el turno del jugador 2, antes habia dos jugador 1
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    // No era necesario crear otro Scanner
    // Scanner s2 = new Scanner();
    String j2 = s.nextLine();

    // Habia doble parentesis de cierre
    // No se puede comparar Strings con ==, ya que son objetos, se debe usar el
    // metodo equals
    if (j1.equals(j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch (j1) {
        case "piedra":
          // No se puede comparar Strings con ==, ya que son objetos, se debe usar el
          // metodo equals
          if (j2.equals("tijeras")) {
            g = 1;
          }
          break; // faltaba un break
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
          } // Faltaba un break y cerrar correctamente el if
          break;
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
          System.out.println("Jugada no válida");
          // Faltaba cerrar el switch con la condiciones de default
          break;
      }
      System.out.println("Gana el jugador " + g);
      //FAltaba cerrar el Scanner
      s.close();
    }

  }
}