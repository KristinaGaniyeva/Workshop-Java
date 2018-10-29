package it.sevenbits.figures;

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
    public Triangle() {
        a = 1;
        b = 1;
        c = 1;
    }

    /**
     * @param a side a
     * @param b side b
     * @param c side c
     */
    public Triangle(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method for determining the existence of a triangle
     * @return true if the triangle exists
     * @throws TriangleException exception for Triangle
     */
    public boolean getExist() throws TriangleException {
        int d = a + b;
        int e = a + c;
        int f = b + c;

        if (d > c && e > b && f > a) {
            return true;
        } else {
            throw new TriangleException("Triangle doesn`t exist");
        }
    }

    /**
     * Method of determining the perimeter
     * @return p
     */
    public int getP() {

        int p = a + b + c;
        return p;
    }

    @Override
    public String toString()  {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(getExist());
            sb.append("\n");
            sb.append("Side a: ").append(a).append("\n");
            sb.append("Side b: ").append(b).append("\n");
            sb.append("Side c: ").append(c).append("\n");
            sb.append("Perimetr triangle: ").append(getP());

        } catch (TriangleException e) {
            sb.append(e.getMessage());
        }
        return sb.toString();
    }
}
