package it.sevenbits.figures;

import it.sevenbits.exceptions.TriangleException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TriangleTest {
    private static Triangle triangle;

    @BeforeClass
    public static void setup() throws TriangleException {
    }

    @Test
    public void testGetP() throws TriangleException {
        triangle = new Triangle(1,1,1);
        assertEquals(3, triangle.getPerimeter());
    }

    @Test(expected = TriangleException.class)
    public void testPairSummaterException() throws TriangleException {
        triangle = new Triangle(1,1,6);
    }
}