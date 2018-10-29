package it.sevenbits.figures;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TriangleTest {
    private static Triangle triangle;

    @BeforeClass
    public static void setup(){
        triangle = new Triangle();
    }

    @Test
    public void testGetExist() throws TriangleException {
        boolean result = triangle.getExist();
        assertTrue(result);
    }

    @Test
    public void testGetP() {
        assertEquals(3, triangle.getP());
    }
}