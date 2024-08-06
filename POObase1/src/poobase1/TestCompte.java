package poobase1;

public class TestCompte {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compte compte = new Compte(2600d);
        System.out.println("J'ajoute 42 au solde et affiche le nouveau solde.");
        compte.deposer(42f);
        compte.afficher();
        System.out.println("Je retire 2,011115 au solde et affiche le nouveau solde.");
        compte.retirer(2.011115f);
        compte.afficher();
    }
}