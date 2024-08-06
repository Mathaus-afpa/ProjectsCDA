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
    public void afficher() {
        System.out.print("La marque de la voiture est ");
        System.out.print(getMarque());
        System.out.print(" et son prix est de ");
        System.out.print(getPrix());
        System.out.println(" euros.");
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    public String getMarque() {
        return this.marque;
    }
    public double getPrix() {
        return this.prix;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    // </editor-fold>
}