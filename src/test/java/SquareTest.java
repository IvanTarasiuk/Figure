import com.github.vanechka.Figure.classes.Square;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testIsFigureValid() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(3);
        point.add(0);
        point.add(3);
        point.add(3);
        point.add(3);

        Square square = new Square(point, 4);
        assertFalse(square.isFigureValid());
    }

    @Test
    void testAreaFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(3);
        point.add(0);
        point.add(3);
        point.add(3);
        point.add(3);

        Square square = new Square(point, 4);
        square.areaFigure();
    }

    @Test
    void testPerimetrFigure() {
        ArrayList<Integer> point = new ArrayList<>();
        point.add(0);
        point.add(0);
        point.add(3);
        point.add(3);
        point.add(0);
        point.add(3);
        point.add(3);
        point.add(3);

        Square square = new Square(point, 4);
        square.perimetrFigure(); // Modify this to assert the expected result
    }
}