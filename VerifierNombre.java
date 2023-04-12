import java.util.Scanner;

public class VerifierNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre = Integer.parseInt(scanner.nextLine());

        // Vérifier si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est pair.");
        } else {
            System.out.println(nombre + " est impair.");
        }

        // Vérifier si le nombre est premier
        boolean estPremier = true;
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                estPremier = false;
                break;
            }
        }
        if (nombre < 2) {
            estPremier = false;
        }
        if (estPremier) {
            System.out.println(nombre + " est premier.");
        } else {
            System.out.println(nombre + " n'est pas premier.");
        }
    }

}
