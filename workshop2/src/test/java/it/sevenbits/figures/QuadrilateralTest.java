package it.sevenbits.figures;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrilateralTest {
    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void setup(){
        quadrilateral = new Quadrilateral();
    }

    @Test
    public void testGetExist() throws QuadrilateralException {
        boolean result = quadrilateral.getExist();
        assertTrue(result);
    }

    @Test
    public void testGetP() {
        assertEquals(21, quadrilateral.getP());
    }
}