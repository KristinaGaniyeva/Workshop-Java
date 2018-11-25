package it.sevenbits;

import it.sevenbits.exceptions.QuadrilateralException;
import it.sevenbits.exceptions.TriangleException;
import it.sevenbits.figures.PolygonFactory;
import java.io.File;
import java.io.IOException;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     */
    public static void main(final String [] args) {
        PolygonFactory polygonFactory = new PolygonFactory();
        File file = new File("./src/main/resources/Polygons.txt");
        try {
            System.out.println(polygonFactory.getPolygonsFromFile(file));
        } catch (TriangleException e) {
            System.out.println("Triangle doesn`t exist");
        } catch (QuadrilateralException e) {
            System.out.println("Quadrilateral doesn`t exist");
        } catch (IOException e) {
            System.out.println("File not found");
        }


    }
}
