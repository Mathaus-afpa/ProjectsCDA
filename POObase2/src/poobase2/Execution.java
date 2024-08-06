package poobase2;

public class Execution {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.setMarque("SUBARU");
        voiture.setPrix(1.1111111d);
        voiture.afficher();
    }
}