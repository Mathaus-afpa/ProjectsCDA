package poobase3;

public class Rectangle {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Rectangle(double longueur, double largeur) {
        setLongueur(longueur);
        setLargeur(largeur);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private double longueur, largeur;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    /**
     * Retourne l'aire de la surface du rectangle.
     * @return 
     */
    public double surface() {
        return this.longueur * this.largeur ;
    }
    /**
     * Retourne le perimetre du rectangle.
     * @return  
     */
    public double perimetre() {
        return 2 * (this.longueur + this.largeur);
    }
    /**
     * Affiche la surface et le perimetre du rectangle
     */
    public void afficher() {
        System.out.print("L'aire de la surface du rectange est : ");
        System.out.println(surface());
        System.out.print("Le perimetre du rectange est : ");
        System.out.println(perimetre());
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter de la longueur
     * @return 
     */
    public double getLongueur() {
        return this.longueur;
    }
    /**
     * Getter de la largeur
     * @return 
     */
    public double getLargeur() {
        return this.largeur;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter de la longueur
     * @param longueur 
     */
    public final void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    /**
     * Setter de la largeur
     * @param largeur 
     */
    public final void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    // </editor-fold>
}