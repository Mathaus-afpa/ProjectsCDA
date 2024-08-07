package pooencapsulation;

public class Bibliotheque {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre programmerEnJava = new Livre("Claude Delannoy", "Programmer en Java");
        programmerEnJava.setNbPages(-962);
        programmerEnJava.setNbPages(962);
        Livre javaEnAction = new Livre("O'Reilly", "Java en action");
        javaEnAction.setNbPages(836);
        programmerEnJava.afficheToi();
        javaEnAction.afficheToi();
        System.out.print("Le total des pages est de ");
        System.out.print(programmerEnJava.getNbPages() + javaEnAction.getNbPages());
        System.out.println(".");
        Livre livre1 = new Livre();
        livre1.setAuteur("Star Designs");
        livre1.setTitre("Spirit, Water, Fire, Earth, Air: Book Of Shadows");
        livre1.setNbPages(300);
        Livre livre2 = new Livre("Renu Kashyap", "Ibiza Bohemia");
        livre2.setNbPages(300);
        Livre livre3 = new Livre("Catherine Thrush", "Dungeon Chronicle", 300);
        livre1.afficheToi();
        livre2.afficheToi();
        livre3.setPrix(25.24);
        Livre livre4 = new Livre("Maud Jan-Ailleret", "Donne-moi des fils ou je meurs", 7.99);
        livre4.setPrix(1);
        livre4.setNbPages(204);
        livre3.afficheToi();
        livre3.afficherPrix();
        livre4.afficheToi();
        livre4.afficherPrix();   
    }
}