import com.github.vanechka.Figure.classes.Sphere;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.assertj.core.api.BDDAssertions.then;

public class SphereTest {
    private final ArrayList<Integer> point = new ArrayList<>();

    @Test
    @DisplayName("Check Sphere validity")
    public void checkValidity() {
        point.add(0);
        point.add(0);
        point.add(0);

        point.add(1);
        point.add(1);
        point.add(1);

        Sphere sphere = new Sphere(point,2);

        boolean check = sphere.isFigureValid();
        then(check).isEqualTo(true);
    }

    @Test
    @DisplayName("Check Sphere invalidity")
    public void checkInvalidity() {

        point.add(0);
        point.add(0);
        point.add(0);

        point.add(0);
        point.add(0);
        point.add(0);

        Sphere sphere = new Sphere(point, 2);

        boolean check = sphere.isFigureValid();
        then(check).isEqualTo(false);
    }

    @Test
    @DisplayName("Check Sphere perimeter calculation")
    public void checkPerimeter() {
        point.add(9);
        point.add(8);
        point.add(7);

        point.add(3);
        point.add(3);
        point.add(3);

        Sphere sphere = new Sphere(point, 2);

        sphere.perimetrFigure();

        then(sphere.perimetrFigure()).isEqualTo(0.0f);
    }

    @Test
    @DisplayName("Check Sphere area calculation")
    public void checkArea() {
        point.add(5);
        point.add(4);
        point.add(3);

        point.add(3);
        point.add(3);
        point.add(3);

        Sphere sphere = new Sphere(point, 2);

        sphere.areaFigure();

        then(sphere.areaFigure()).isEqualTo(0.0);
    }
}