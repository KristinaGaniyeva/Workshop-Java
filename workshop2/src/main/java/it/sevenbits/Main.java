package it.sevenbits;

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

        Triangle triangle = new Triangle();
        System.out.println(triangle.toString());
    }
}
