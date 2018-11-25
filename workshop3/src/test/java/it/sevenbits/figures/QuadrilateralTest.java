package it.sevenbits.figures;

import it.sevenbits.exceptions.QuadrilateralException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrilateralTest {
    private static Quadrilateral quadrilateral;

    @BeforeClass
    public static void setup() throws QuadrilateralException {
        quadrilateral = new Quadrilateral(1,1,1,1);
    }


    @Test
    public void testGetPerimeter() {
        assertEquals(4, quadrilateral.getPerimeter());
    }


}