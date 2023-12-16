import com.github.vanechka.Figure.classes.Polygon;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void testIsFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        point.add(4);
        point.add(3);
        point.add(1);
        point.add(3);

        Polygon polygon = new Polygon(point, 4);
        assertTrue(polygon.isFigureValid());
    }

    @Test
    void testAreaFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        point.add(4);
        point.add(3);
        point.add(1);
        point.add(3);

        Polygon polygon = new Polygon(point, 4);
        double expectedArea = 0 * ((0 * 0) + (3 * 3) + (4 * 3) + (1 * 0) - (0 * 3) - (3 * 4) - (4 * 1) - (1 * 0));
        assertEquals(expectedArea, polygon.areaFigure(), 0.0001);
    }

    @Test
    void testPerimeterFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        point.add(4);
        point.add(3);
        point.add(1);
        point.add(3);

        Polygon polygon = new Polygon(point, 4);
        double expectedPerimeter = Math.sqrt((0 * 3) + (0 * 3)) + Math.sqrt((0 * 1) + (0 * 3)) + Math.sqrt((0 * 0) + (0 * 3));
        assertEquals(expectedPerimeter, polygon.perimetrFigure(), 0.0001);
    }
}