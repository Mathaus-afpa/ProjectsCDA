package poobase2;

public class Voiture {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Voiture() {}
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private String marque;
    private double prix;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    /**
     * Affiche la marque et le prix de la voiture
     */
    public void afficher() {
        System.out.print("La marque de la voiture est ");
        System.out.print(getMarque());
        System.out.print(" et son prix est de ");
        System.out.print(getPrix());
        System.out.println(" euros.");
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter de la marque
     * @return 
     */
    public String getMarque() {
        return this.marque;
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
     * Setter de la marque
     * @param marque 
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }
    /**
     * Setter du prix
     * @param prix 
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
    // </editor-fold>
}