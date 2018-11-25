package it.sevenbits.figures;

import it.sevenbits.exceptions.QuadrilateralException;
import it.sevenbits.exceptions.TriangleException;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class PolygonFactoryTest {
    private static PolygonFactory polygonFactory;
    private static File fileTest;

    @BeforeClass
    public static void setup() {
        polygonFactory = new PolygonFactory();
        fileTest = new File("./src/test/resources/PolygonsTest.txt");
    }

    @Test
    public void testGetPolygonsFromFile() throws QuadrilateralException, IOException, TriangleException {
        ArrayList<IPolygon> result = new ArrayList<IPolygon>(polygonFactory.getPolygonsFromFile(fileTest));
        ArrayList <IPolygon> expected = new ArrayList<IPolygon>();
        expected.add(polygonFactory.getTriangle(1, 1, 1));
        expected.add(polygonFactory.getQuadrilateral(1, 1, 1, 1));
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    public void testGetPolygonsFromFileNotNull() throws QuadrilateralException, IOException, TriangleException {
        ArrayList<IPolygon> expected = new ArrayList<IPolygon>(polygonFactory.getPolygonsFromFile(fileTest));
        assertNotNull(expected);
    }

    @Test(expected = QuadrilateralException.class)
    public void testGetPolygonsFromFileQuadrilateralException() throws IOException, QuadrilateralException, TriangleException {
        File fileException = new File("./src/test/resources/PolygonsException.txt");
        ArrayList<IPolygon> result = new ArrayList<IPolygon>(polygonFactory.getPolygonsFromFile(fileException));
    }

    @Test(expected = IOException.class)
    public void testGetPolygonsFromFileIOException() throws IOException, QuadrilateralException, TriangleException {
        File fileException = new File("./src/test/resources/PolygonsExceptionFile.txt");
        ArrayList<IPolygon> result = new ArrayList<IPolygon>(polygonFactory.getPolygonsFromFile(fileException));
    }
}