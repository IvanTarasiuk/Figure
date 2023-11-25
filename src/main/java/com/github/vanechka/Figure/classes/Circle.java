package com.github.vanechka.Figure.classes;

import java.util.ArrayList;

public class Circle extends Figure {

    private ArrayList<Integer> point;
    private int count;
    public Circle(ArrayList<Integer> point, int count) {
        super(point);
        this.point = point;
        this.count = count;
    }
    @Override
    public  boolean isFigureValid() {
        return (point.size() == FOUR && (point.get(0) != point.get(INDEX_TWO) || point.get(1) != point.get(INDEX_THREE))) && count == DEGREE
                || (point.size() == SIX && (point.get(0) != point.get(INDEX_THREE) || point.get(1) != point.get(INDEX_FOUR) || point.get(INDEX_TWO) != point.get(INDEX_FIVE))) && count == DEGREE;
    }

    @Override
    public void areaFigure() {
        if (point.size() == FOUR) {
            double radius = (Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE));
            System.out.printf("%.2f", Math.PI * radius);
        } else if (point.size() == SIX) {
            double radius = (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE));
            System.out.printf("%.2f", Math.PI * radius);
        }
    }

    @Override
    public void perimetrFigure() {
        if (point.size() == FOUR) {
            double radius = (Math.pow(point.get(0) - point.get(INDEX_TWO), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_THREE), DEGREE));
            System.out.printf("%.2f", Math.PI * 2 * Math.sqrt(radius));
        } else if (point.size() == SIX) {
            Double radius = (Math.pow(point.get(0) - point.get(INDEX_THREE), DEGREE) + Math.pow(point.get(1) - point.get(INDEX_FOUR), DEGREE) + Math.pow(point.get(INDEX_TWO) - point.get(INDEX_FIVE), DEGREE));
            System.out.printf("%.2f", Math.PI * 2 * Math.sqrt(radius));
        }

    }


}