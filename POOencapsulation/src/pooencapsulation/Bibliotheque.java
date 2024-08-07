package pooencapsulation;

public class Bibliotheque {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre programmerEnJava = new Livre("Claude Delannoy", "Programmer en Java");
        programmerEnJava.setNbPages(962);
        Livre javaEnAction = new Livre("O'Reilly", "Java en action");
        javaEnAction.setNbPages(836);
        afficherLivre(programmerEnJava);
        afficherLivre(javaEnAction);
    }
    /**
     * Affiche les informations d'un livre dans la console
     * @param livre 
     */
    private static void afficherLivre(Livre livre) {
        System.out.print("Le livre \"");
        System.out.print(livre.getTitre());
        System.out.print("\" a pour auteur ");
        System.out.print(livre.getAuteur());
        System.out.print(" et possede ");
        System.out.print(livre.getNbPages());
        System.out.println(" pages.");
    }
}