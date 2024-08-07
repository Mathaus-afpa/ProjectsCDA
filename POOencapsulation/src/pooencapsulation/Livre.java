package pooencapsulation;

public class Livre {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Livre() {}
    public Livre(String unAuteur, String unTitre) {
        setAuteur(unAuteur);
        setTitre(unTitre);
    }
    public Livre(String unAuteur, String unTitre, int nbPages) {
        setAuteur(unAuteur);
        setTitre(unTitre);
        setNbPages(nbPages);
    }
    public Livre(String unAuteur, String unTitre, double prix) {
        setAuteur(unAuteur);
        setTitre(unTitre);
        setPrix(prix);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe = false;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    /**
     * Affiche les informations d'un livre dans la console
     */
    public void afficheToi() {
        System.out.print("Le livre \"");
        System.out.print(this.getTitre());
        System.out.print("\" a pour auteur ");
        System.out.print(this.getAuteur());
        System.out.print(" et possede ");
        System.out.print(this.getNbPages());
        System.out.println(" pages.");
    }
    /**
     * Affiche le prix du livre
     */
    public void afficherPrix() {
        System.out.print("Le prix du livre est ");
        System.out.print(this.getPrix());
        System.out.println(" euros."); 
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter de l'auteur
     * @return 
     */
    public String getAuteur() {
        return this.auteur;
    }
    /**
     * Getter du titre
     * @return 
     */
    public String getTitre() {
        return this.titre;
    }
    /**
     * Getter du nombre de page
     * @return 
     */
    public int getNbPages() {
        return this.nbPages;
    }
    /**
     * Getter du prix
     * @return 
     */
    public double getPrix() {
       return this.prix; 
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter de l'auteur
     * @param auteur 
     */
    public final void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    /**
     * Setter du titre
     * @param titre 
     */
    public final void setTitre(String titre) {
        this.titre = titre;
    }
    /**
     * Setter du nombre de page
     * @param n 
     */
    public final void setNbPages(int n) {
        if (n < 0 ) {
            System.err.println("Le nombre de page ne peut pas etre negatif.");
        } else {
            this.nbPages = n;
        }
    }
    /**
     * Setter du prix
     * @param prix 
     */
    public final void setPrix(double prix) {
        if (!prixFixe && prix >= 0) {
            this.prix = prix;
            this.prixFixe = true;
        } else {
            System.err.println("Impossible de changter le prix");
        }    
    }
    // </editor-fold>
}