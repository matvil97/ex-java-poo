public class SommeNombres {
    public static void main(String[] args) {
        int n = 10000;
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i;
        }
        System.out.println("La somme des nombres jusqu'à " + n + " est : " + somme);
    }
}
