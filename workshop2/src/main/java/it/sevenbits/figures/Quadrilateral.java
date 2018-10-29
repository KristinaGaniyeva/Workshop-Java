package it.sevenbits.figures;

/**
 * Class Quadrilateral
 */
public class Quadrilateral implements Polygon {

    /** Side a */
    private int a;
    /** Side b */
    private int b;
    /** Side c */
    private int c;
    /** Side d */
    private int d;

    /**
     * Base constructor
     */
    public Quadrilateral() {
        a = 1;
        b = 3;
        c = 8;
        d = 9;
    }


    /**
     * @param a side a
     * @param b side b
     * @param c side c
     * @param d side d
     */
    public Quadrilateral(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Method of determining the perimeter
     * @return p
     */
    public int getP() {
        int p = a + b + c + d;
        return p;
    }

    /**
     * Method for determining the existence of a quadrilateral
     * @return true if the triangle exists
     * @throws QuadrilateralException exception for Quadrilateral
     */
    public boolean getExist() throws QuadrilateralException {
        int e = a + b + c;
        int f = a + b + d;
        int g = a + c + d;
        int h = b + c + d;

        if (e > d && f > c && g > b && h > a) {
            return true;
        } else {
            throw new QuadrilateralException("Quadrilateral doesn`t exist");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(getExist());
            sb.append("\n");
            sb.append("Side a: ").append(a).append("\n");
            sb.append("Side b: ").append(b).append("\n");
            sb.append("Side c: ").append(c).append("\n");
            sb.append("Side d: ").append(d).append("\n");
            sb.append("Parimetr Quadrilateral: ").append(getP());
        } catch (QuadrilateralException e) {
            sb.append(e.getMessage());
        }
        return sb.toString();
        }
}
