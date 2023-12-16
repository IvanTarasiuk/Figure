import com.github.vanechka.Figure.classes.Parallelogram;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ParallelogramTest {

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

        Parallelogram parallelogram = new Parallelogram(point, 4);
        assertTrue(parallelogram.isFigureValid());
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

        Parallelogram parallelogram = new Parallelogram(point, 4);
        double expectedArea = 0 * 3;
        assertEquals(expectedArea, parallelogram.areaFigure(), 0.0001);
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

        Parallelogram parallelogram = new Parallelogram(point, 4);
        double expectedPerimeter = 0 * (3 + 4);
        assertEquals(expectedPerimeter, parallelogram.perimetrFigure(), 0.0001);
    }
}