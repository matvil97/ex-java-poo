public class Chaine {

    private String texte;
 
    public Chaine(String texte) {
       this.texte = texte;
    }
 
    public String inverser() {
       String resultat = "";
       for (int i = texte.length() - 1; i >= 0; i--) {
          resultat += texte.charAt(i);
       }
       return resultat;
    }
 
    public static void main(String[] args) {
       Chaine chaine = new Chaine("Bonjour");
       System.out.println(chaine.inverser());
    }
 }
 
