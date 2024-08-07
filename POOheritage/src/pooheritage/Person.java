package pooheritage;

public class Person {
    // <editor-fold defaultstate="collapsed" desc="Constructeurs">
    public Person() {}
    public Person(String name, String address) {
        setName(name);
        setAddress(address);
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Proprietes">
    private String name;
    private String address;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Methodes">
    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.getName(), this.getAddress());
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getter">
    /**
     * Getter du nom
     * @return 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Getter de l'adresse
     * @return 
     */
    public String getAddress() {
        return this.address;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setter">
    /**
     * Setter du nom
     * @param name 
     */
    public final void setName(String name) {
        this.name = name;
    }
    /**
     * Setter de l'adresse
     * @param address 
     */
    public final void setAddress(String address) {
        this.address = address;
    }
    // </editor-fold>
}