package pooheritage;

public class Student extends Person {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Student(String name, String address) {
        super(name, address);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private String program;
    private int year;
    private double fee;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    @Override
    public String toString() {
        return String.format("Student[%s, program=%s, year=%s, fee=%s]", super.toString(), this.program, this.year, this.fee);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter de la formation
     * @return 
     */
    public String getProgram() {
        return this.program;
    }
    /**
     * Getter de l'année de formation
     * @return 
     */
    public int getYear() {
        return this.year;
    }
    /**
     * Getter du cout de la formation
     * @return 
     */
    public double getFee() {
        return this.fee;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter de la formation
     * @param program 
     */
    public void setProgram(String program) {
        this.program = program;
    }
    /**
     * Setter de l'année de la formation
     * @param year 
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * Setter du cout de la formation
     * @param fee 
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    // </editor-fold>
}