package it.sevenbits;

import it.sevenbits.exceptions.TriangleException;
import it.sevenbits.figures.Polygon;
import it.sevenbits.figures.Triangle;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String [] args) {
        try {
            Polygon triangle = new Triangle(1, 1, 1);
            System.out.println(triangle.toString());
        } catch (TriangleException e) {
            System.out.println("Triangle doesn`t exist");
        }

    }
}
