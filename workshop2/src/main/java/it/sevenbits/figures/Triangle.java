package it.sevenbits.figures;

import it.sevenbits.exceptions.TriangleException;

/**
 * Class Triangle
 */
public class Triangle implements Polygon {
    /** Side a */
    private int a;
    /** Side b */
    private int b;
    /** Side c */
    private int c;

    /**
     * Base constructor
     */
    private Triangle() {
    }

    /**
     * @param a side a
     * @param b side b
     * @param c side c
     */
    public Triangle(final int a, final int b, final int c) throws TriangleException {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new TriangleException("Triangle doesn`t exist");
        }
    }

    /**
     * Method of determining the perimeter
     * @return p
     */
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
            sb.append("Side a: ").append(a).append("\n");
            sb.append("Side b: ").append(b).append("\n");
            sb.append("Side c: ").append(c).append("\n");
            sb.append("Perimetr triangle: ").append(getPerimeter());
        return sb.toString();
    }
}
