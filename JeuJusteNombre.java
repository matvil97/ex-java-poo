import java.util.Random;
import java.util.Scanner;

public class JeuJusteNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1;
        int tentative = 0;

        while (true) {
            System.out.print("Entrez un nombre entre 1 et 100 : ");
            int nombre = scanner.nextInt();
            tentative++;
            if (nombre < nombreAleatoire) {
                System.out.println("Plus grand !");
            } else if (nombre > nombreAleatoire) {
                System.out.println("Plus petit !");
            } else {
                System.out.println("Bravo, t'a trouvé le nombre en " + tentative + " coups !");
                break;
            }
        }
    }
}