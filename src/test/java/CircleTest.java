import com.github.vanechka.Figure.classes.Circle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testIsFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);

        Circle circle = new Circle(point, 3);
        assertFalse(circle.isFigureValid());
    }

    @Test
    void testAreaFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);

        Circle circle = new Circle(point, 3);
        circle.areaFigure();
    }

    @Test
    void testPerimetrFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);

        Circle circle = new Circle(point, 3);
        circle.perimetrFigure();
    }
}