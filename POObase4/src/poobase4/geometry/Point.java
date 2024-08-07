package poobase4.geometry;

public class Point {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Point(double abscisse, double ordonnee) {
        setAbscisse(abscisse);
        setOrdonnee(ordonnee);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private double abscisse, ordonnee;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter de l'abscisse
     * @return 
     */
    public double getAbscisse() {
        return this.abscisse;
    }
    /**
     * Getter de l'ordonnee
     * @return 
     */
    public double getOrdonnee() {
        return this.ordonnee;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter de l'abscisse
     * @param abscisse 
     */
    public final void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }
    /**
     * Setter de l'ordonnee
     * @param ordonnee 
     */
    public final void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }
    // </editor-fold>
}