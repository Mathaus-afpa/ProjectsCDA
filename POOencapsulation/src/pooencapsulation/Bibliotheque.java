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
        livre3.afficheToi();
    }
}