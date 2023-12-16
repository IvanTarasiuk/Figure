import com.github.vanechka.Figure.classes.Cylinder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class CylinderTest {
    private final ArrayList<Integer> point = new ArrayList<>();

    @Test
    public void checkValidity() {
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(1);
        point.add(1);

        Cylinder cylinder = new Cylinder(point, 3);

        boolean check = cylinder.isFigureValid();
        then(check).isEqualTo(true);
    }

    @Test
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

        Cylinder cylinder = new Cylinder(point, 3);

        boolean check = cylinder.isFigureValid();
        then(check).isEqualTo(false);
    }

    @Test
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

        Cylinder cylinder = new Cylinder(point, 3);

        cylinder.perimetrFigure();

        then(cylinder.perimetrFigure()).isEqualTo(0.0f);
    }

    @Test
    public void checkArea() {
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(0);
        point.add(1);
        point.add(1);
        point.add(1);
        point.add(1);

        Cylinder cylinder = new Cylinder(point, 3);

        cylinder.areaFigure();

        then(cylinder.areaFigure()).isEqualTo(-1.0);
    }
}