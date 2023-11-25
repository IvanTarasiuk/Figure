package com.github.vanechka.Figure.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Sphere extends Figure {

    private ArrayList<Integer> point;
    private int count;

    public Sphere(ArrayList<Integer> point, int count) {
        super(point);
        this.point = point;
        this.count = count;
    }
    @Override
    public boolean isFigureValid() {
        return count == 2 && point.size() == SIX && (!Objects.equals(point.get(0), point.get(INDEX_THREE)) || !Objects.equals(point.get(1), point.get(INDEX_FOUR)) || !Objects.equals(point.get(INDEX_TWO), point.get(INDEX_FIVE)));
    }

    @Override
    public void areaFigure() {
        System.out.printf("%.2f", Math.PI * FOUR * (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE)));
    }

    @Override
    public void perimetrFigure() {
        System.out.print("Figure.Sphere has no perimetr.");
    }
}