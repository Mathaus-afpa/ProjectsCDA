package poobase4.geometry;

public class Cercle {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Cercle(double rayon) {
        setRayon(rayon);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private Point centre;
    private double rayon;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    /**
     * Retourne le perimetre du cercle
     * @return 
     */
    public double perimetre() {
        return 2 * Math.PI * getRayon();
    }
    /**
     * Retourne la surface du cercle
     * @return 
     */
    public double surface() {
        return Math.PI * getRayon() * getRayon();
    }
    /**
     * Ecrit dans la console si un point appartient au cercle ou non
     * @param point 
     */
    public void testAppartenance(Point point) {
        if (point == null || this.centre == null) {
            System.out.println("Le centre ou le point est null.");
        } else {
            double distanceX = Math.pow(point.getAbscisse() - this.centre.getAbscisse(), 2);
            double distanceY = Math.pow(point.getOrdonnee() - this.centre.getOrdonnee(), 2);
            double distance = Math.sqrt(distanceX + distanceY);
            System.out.print("Le point de coordonnee (");
            System.out.print(point.getAbscisse());
            System.out.print(",");
            System.out.print(point.getOrdonnee());
            System.out.print(")");
            if (distance == this.rayon) {
                System.out.print(" appartient au cercle.");
            } else {
                System.out.print(" n'appartient pas au cercle.");
            }
            System.out.println();
        }
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter du centre
     * @return 
     */
    public Point getCentre() {
        return this.centre;
    }
    /**
     * Getter du rayon
     * @return 
     */
    public double getRayon() {
        return this.rayon;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter du centre
     * @param abscisse
     * @param ordonnee 
     */
    public final void setCentre(double abscisse, double ordonnee) {
        this.centre = new Point(abscisse, ordonnee);
    }
    /**
     * Setter du rayon
     * @param rayon 
     */
    public final void setRayon(double rayon) {
        this.rayon = (rayon < 0) ? 0 : rayon;
    }
    // </editor-fold>
}