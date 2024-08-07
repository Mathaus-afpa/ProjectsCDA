package poobase4;

import poobase4.geometry.Cercle;
import poobase4.geometry.Point;

public class TestCercle {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cercle cercle = new Cercle(13);
        cercle.setCentre(-1, 2);
        Point A = new Point(10, -5);
        Point B = new Point(11, 7);
        cercle.testAppartenance(A);
        cercle.testAppartenance(B);
    }
}