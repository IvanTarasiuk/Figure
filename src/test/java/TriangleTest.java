import com.github.vanechka.Figure.classes.Triangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class TriangleTest {
    private final ArrayList<Integer> point = new ArrayList<>();

    @Test
    @DisplayName("Check Triangle validity")
    public void checkValidity() {
        point.add(1);
        point.add(1);

        point.add(1);
        point.add(1);

        point.add(1);
        point.add(1);

        Triangle triangle = new Triangle(point, 3);

        boolean check = triangle.isFigureValid();
        then(check).isEqualTo(false);

        point.clear();

        point.add(1);
        point.add(1);
        point.add(1);

        point.add(10);
        point.add(10);
        point.add(10);

        point.add(1);
        point.add(1);
        point.add(10);

        triangle = new Triangle(point, 3);

        check = triangle.isFigureValid();

        then(check).isEqualTo(false);
    }

    @Test
    @DisplayName("Check Triangle invalidity")
    public void checkInvalidity() {

        point.add(-1);
        point.add(-1);

        point.add(-1);
        point.add(1);

        point.add(1);
        point.add(1);

        Triangle triangle = new Triangle(point, 3);

        boolean check = triangle.isFigureValid();
        then(check).isEqualTo(true);

        point.clear();

        point.add(1);
        point.add(1);
        point.add(1);

        point.add(2);
        point.add(2);
        point.add(2);

        point.add(3);
        point.add(3);
        point.add(3);

        triangle = new Triangle(point, 3);

        check = triangle.isFigureValid();
        then(check).isEqualTo(false);
    }

    @Test
    @DisplayName("Check Triangle perimeter calculation")
    public void checkPerimeterCalculation() {
        point.add(0);
        point.add(0);

        point.add(5);
        point.add(10);

        point.add(10);
        point.add(0);

        Triangle triangle = new Triangle(point, 3);

        triangle.perimetrFigure();
        then(triangle.perimetrFigure()).isEqualTo(0.0f);

        point.clear();

        point.add(0);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(5);

        triangle = new Triangle(point, 3);

        triangle.perimetrFigure();
        then(triangle.perimetrFigure()).isEqualTo(0.0f);
    }

    @Test
    @DisplayName("Check Triangle area calculation")
    public void checkAreaCalculation() {

        point.add(0);
        point.add(0);

        point.add(5);
        point.add(10);

        point.add(10);
        point.add(0);

        Triangle triangle = new Triangle(point, 3);

        triangle.areaFigure();
        then(triangle.areaFigure()).isEqualTo(0.00);

        point.clear();

        point.add(0);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(5);

        triangle = new Triangle(point, 3);

        triangle.areaFigure();
        then(triangle.areaFigure()).isEqualTo(0);
    }
}