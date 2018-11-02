package it.sevenbits;

import it.sevenbits.exceptions.QuadrilateralException;
import it.sevenbits.exceptions.TriangleException;
import it.sevenbits.figures.Quadrilateral;
import it.sevenbits.figures.Triangle;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String [] args) throws TriangleException, QuadrilateralException {
        Quadrilateral triangle = new Quadrilateral(1,1,1,1);
        System.out.println(triangle.toString());
    }
}
