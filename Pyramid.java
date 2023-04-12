public class Pyramid {
    public static void main(String[] args) {
        int n = 5; 
        String symbol = "$"; // => Symbole "$" utilisé sur la pyramide
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); 
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(symbol); 
            }
            System.out.println(); // => passage a la ligne suivante
        }
    }
}
