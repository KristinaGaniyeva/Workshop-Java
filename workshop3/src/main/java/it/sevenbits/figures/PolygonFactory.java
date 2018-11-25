package it.sevenbits.figures;

import it.sevenbits.exceptions.QuadrilateralException;
import it.sevenbits.exceptions.TriangleException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * Factory PolygonFactory
 */
public class PolygonFactory {
    /**
     * The method takes the input side length, returns a triangle
     * @param a side a
     * @param b side b
     * @param c side c
     * @return triangle
     * @throws TriangleException triangle exception
     */
    public Triangle getTriangle(final int a, final int b, final int c) throws TriangleException {
        return new Triangle(a, b, c);
    }

    /**
     * The method takes the input side length, returns a quadrilateral
     * @param a side a
     * @param b side b
     * @param c side c
     * @param d side d
     * @return quadrilateral
     * @throws QuadrilateralException quadrilateral exception
     */
    public Quadrilateral getQuadrilateral(final int a, final int b, final int c, final int d) throws QuadrilateralException {
        return new Quadrilateral(a, b, c, d);
    }

    /**
     * The method accepts a config file describing polygons, returns a list of objects
     * @param file the path to the file
     * @return list of objects
     * @throws IOException file exception
     * @throws TriangleException triangle exception
     * @throws QuadrilateralException quadrilateral exception
     */
    public ArrayList getPolygonsFromFile(final File file) throws IOException, TriangleException, QuadrilateralException {
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String[] elements;
        ArrayList<IPolygon> list = new ArrayList<IPolygon>();
        String strLine;
        while ((strLine = fileReader.readLine()) != null) {

            elements = strLine.split(" ");
            switch (elements.length) {
                case 3 :
                    list.add(getTriangle(Integer.parseInt(elements[0]), Integer.parseInt(elements[1]), Integer.parseInt(elements[2])));
                    break;
                case 4 :
                    list.add(getQuadrilateral(Integer.parseInt(elements[0]),
                            Integer.parseInt(elements[1]), Integer.parseInt(elements[2]), Integer.parseInt(elements[3])));
                    break;
            }
    }
        fileReader.close();

        return list;
    }

}
