public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // Nombre de rangées de la pyramide
        String symbol = "p"; // Symbole utilisé pour construire la pyramide
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Affiche des espaces pour décaler la pyramide vers la droite
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(symbol); // Affiche le symbole de la pyramide
            }
            System.out.println(); // Passe à la ligne suivante pour afficher la rangée suivante de la pyramide
        }
    }
}
