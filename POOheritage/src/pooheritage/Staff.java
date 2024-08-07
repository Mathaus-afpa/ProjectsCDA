package pooheritage;

public class Staff extends Person {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Staff(String name, String address) {
        super(name, address);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private String school;
    private double pay;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    @Override
    public String toString() {
        return String.format("Staff[%s, school=%s, pay=%s]", super.toString(), this.school, this.pay);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter de l'école
     * @return 
     */
    public String getSchool() {
        return this.school;
    }
    /**
     * Getter du salaire
     * @return 
     */
    public double getPay() {
        return this.pay;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter de l'école
     * @param school 
     */
    public void setSchool(String school) {
        this.school = school;
    }
    /**
     * Setter du salaire
     * @param pay 
     */
    public void setPay(double pay) {
        this.pay = pay;
    }
    // </editor-fold>
}