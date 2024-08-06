package poobase1;

public class Compte {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    /**
     * Constructeur
     * @param solde 
     */
    public Compte(double solde) {
        setSolde(solde);
    }    
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private double solde;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    /**
     * Ajoute la valeur absolue de depot au solde.
     * @param depot 
     */
    public void deposer(double depot) {
        double nouveauSolde = this.solde += Math.abs(depot);
        setSolde(nouveauSolde);
    }
    /**
     * Retire la valeur absolue de retrait du solde.
     * @param retrait 
     */
    public void retirer(double retrait) {
        double nouveauSolde = this.solde -= Math.abs(retrait);
        setSolde(nouveauSolde);
    }
    /**
     * Affiche la valeur du solde.
     */
    public void afficher() {
        System.out.printf("Le solde est de %f euros.", getSolde());
        System.out.println();
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter du solde
     * @return 
     */
    private double getSolde() {
        return this.solde;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter du solde
     * @param solde 
     */
    private void setSolde(double solde) {
        this.solde = solde;
    }
    // </editor-fold>
}