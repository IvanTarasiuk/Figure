import com.github.vanechka.Figure.classes.Cone;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class ConeTest {
    private final ArrayList<Integer> point = new ArrayList<>();

    @Test
    @DisplayName("Check Cone validity")
    public void checkValidity() {
        point.add(0);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(0);

        point.add(0);
        point.add(0);
        point.add(1);

        Cone cone = new Cone(point, 3);

        boolean check = cone.isFigureValid();
        then(check).isEqualTo(true);
    }

    @Test
    @DisplayName("Check Cone invalidity")
    public void checkInvalidity() {
        point.add(1);
        point.add(1);
        point.add(1);

        point.add(1);
        point.add(1);
        point.add(0);

        point.add(1);
        point.add(1);
        point.add(2);

        Cone cone = new Cone(point, 3);

        boolean check = cone.isFigureValid();
        then(check).isEqualTo(false);
    }

    @Test
    @DisplayName("Check Cone perimeter calculation")
    public void checkPerimeter() {
        point.add(0);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(0);

        point.add(0);
        point.add(0);
        point.add(2);

        Cone cone = new Cone(point, 3);

        cone.perimetrFigure();

        then(cone.perimetrFigure()).isEqualTo(0.0f);
    }

    @Test
    @DisplayName("Check Cone area calculation")
    public void checkArea() {
        point.add(0);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(0);
        point.add(0);

        point.add(0);
        point.add(0);
        point.add(2);

        Cone cone = new Cone(point, 3);

        cone.areaFigure();

        then(cone.areaFigure()).isEqualTo(1.0);
    }
}