import com.github.vanechka.Figure.classes.Rectangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testIsFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        point.add(3);
        point.add(4);
        point.add(0);
        point.add(4);

        Rectangle rectangle = new Rectangle(point, 4);
        assertTrue(rectangle.isFigureValid());
    }

    @Test
    void testAreaFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        point.add(3);
        point.add(4);
        point.add(0);
        point.add(4);

        Rectangle rectangle = new Rectangle(point, 4);
        rectangle.areaFigure();
    }

    @Test
    void testPerimetrFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(0);
        point.add(3);
        point.add(4);
        point.add(0);
        point.add(4);

        Rectangle rectangle = new Rectangle(point, 4);
        rectangle.perimetrFigure();
    }
}