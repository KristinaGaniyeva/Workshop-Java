package it.sevenbits.figures;

import it.sevenbits.exceptions.QuadrilateralException;

/**
 * Class Quadrilateral
 */
public class Quadrilateral implements IPolygon {

    /**
     * Side a
     */
    private int a;
    /**
     * Side b
     */
    private int b;
    /**
     * Side c
     */
    private int c;
    /**
     * Side d
     */
    private int d;

    /**
     * Base constructor
     */
    private Quadrilateral() {
    }

    /**
     * @param a side a
     * @param b side b
     * @param c side c
     * @param d side d
     * @exception QuadrilateralException exception
     */
    public Quadrilateral(final int a, final int b, final int c, final int d) throws QuadrilateralException {
        if (a + b + c > d && a + b + d > c && a + c + d > b && b + c + d > a) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        } else {
            throw new QuadrilateralException("Quadrilateral doesn`t exist");
        }
    }

    /**
     * Method of determining the perimeter
     *
     * @return p
     */
    public int getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Side a: ").append(a).append("\n");
        sb.append("Side b: ").append(b).append("\n");
        sb.append("Side c: ").append(c).append("\n");
        sb.append("Side d: ").append(d).append("\n");
        sb.append("Perimeter Quadrilateral: ").append(getPerimeter()).append("\n");
        return sb.toString();
    }
}