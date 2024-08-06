package poobase3;

public class TestRectangle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 12);
        Rectangle rectangle2 = new Rectangle(2, 2);
        Rectangle rectangle3 = new Rectangle(0, 1);
        rectangle1.afficher();
        rectangle2.afficher();
        rectangle3.afficher();
    }
}